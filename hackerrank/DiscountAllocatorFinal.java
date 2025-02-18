package hackerrank;

import java.util.*;

class Customer {
    String name;
    int spend;
    int totalDiscount; // Track total assigned discount value
    int discountCount; // Track number of assigned discounts

    public Customer(String name, int spend) {
        this.name = name;
        this.spend = spend;
        this.totalDiscount = 0;
        this.discountCount = 0;
    }

    public boolean canTakeDiscount(int discount) {
        int maxAllowed = (int) (0.2 * spend); // 20% of yearly spend
        return discountCount < 3 && (totalDiscount + discount) <= maxAllowed;
    }
}

class Discount {
    String product;
    int amount;

    public Discount(String product, int amount) {
        this.product = product;
        this.amount = amount;
    }
}

public class DiscountAllocatorFinal {
    public static Map<String, List<Integer>> assignDiscounts(List<Customer> customers, List<Discount> discounts) {
        // Sort customers in descending order of spending (higher spenders first)
        customers.sort((a, b) -> Integer.compare(b.spend, a.spend));

        // Sort discounts in descending order of discount value (higher discounts first)
        discounts.sort((a, b) -> Integer.compare(b.amount, a.amount));

        // Map to store assigned discounts
        Map<String, List<Integer>> assignedDiscounts = new HashMap<>();
        for (Customer customer : customers) {
            assignedDiscounts.put(customer.name, new ArrayList<>());
        }
        PriorityQueue<Customer> pq = new PriorityQueue<>(
                (a, b) -> a.discountCount == b.discountCount ? Integer.compare(b.spend, a.spend) : Integer.compare(a.discountCount, b.discountCount)
        );

        // Add all customers to the Priority Queue
        pq.addAll(customers);


        // Assign discounts using priority queue
        for (Discount discount : discounts) {
            if (!pq.isEmpty()) {
                Customer customer = pq.poll(); // Get the best customer to assign discount

                if (customer.canTakeDiscount(discount.amount)) {
                    assignedDiscounts.get(customer.name).add(discount.amount);
                    customer.totalDiscount += discount.amount;
                    customer.discountCount++;

                    // Add back to priority queue for the next allocation
                    pq.add(customer);
                }
            }
        }

        return assignedDiscounts;
    }

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>(Arrays.asList(
                new Customer("Alice", 5000),
                new Customer("Bob", 3000),
                new Customer("Charlie", 1000),
                new Customer("David", 2000)
        ));

        List<Discount> discounts = new ArrayList<>(Arrays.asList(
                new Discount("Laptop", 400),
                new Discount("Phone", 300),
                new Discount("Tablet", 200),
                new Discount("TV", 150),
                new Discount("Headphones", 100),
                new Discount("Smartwatch", 250),
                new Discount("Gaming Console", 350)
        ));

        Map<String, List<Integer>> assignedDiscounts = assignDiscounts(customers, discounts);

        // Print final result
        System.out.println("Final Assigned Discounts:");
        for (Map.Entry<String, List<Integer>> entry : assignedDiscounts.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
