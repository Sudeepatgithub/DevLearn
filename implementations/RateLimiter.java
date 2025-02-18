package implementations;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class RateLimiter {
    private final int maxRequests; // Maximum number of requests allowed
    private final int timeWindow; // Time window in seconds
    private final HashMap<String, Queue<Long>> clientRequests; // Map to track client requests

    public RateLimiter(int maxRequests, int timeWindow) {
        this.maxRequests = maxRequests;
        this.timeWindow = timeWindow;
        this.clientRequests = new HashMap<>();
    }

    // Method to check if a request is allowed
    public synchronized boolean isRequestAllowed(String clientId) {
        long currentTime = System.currentTimeMillis() / 1000; // Current time in seconds

        // Get or create the queue for the client
        clientRequests.putIfAbsent(clientId, new LinkedList<>());
        Queue<Long> requestQueue = clientRequests.get(clientId);

        // Remove timestamps that are outside the time window
        while (!requestQueue.isEmpty() && requestQueue.peek() <= currentTime - timeWindow) {
            requestQueue.poll();
        }

        // Check if the request can be allowed
        if (requestQueue.size() < maxRequests) {
            requestQueue.add(currentTime); // Add current timestamp
            return true;
        } else {
            return false; // Deny the request
        }
    }

    public static void main(String[] args) {
        RateLimiter rateLimiter = new RateLimiter(5, 10); // Max 5 requests in 10 seconds

        String clientId = "client1";

        // Simulating API requests
        for (int i = 0; i < 10; i++) {
            boolean allowed = rateLimiter.isRequestAllowed(clientId);
            System.out.println("Request " + (i + 1) + " allowed: " + allowed);

            try {
                // Sleep for 2 seconds between requests
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

