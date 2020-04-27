package DataStructuresAndAlgorithms.queues;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        System.out.println(queue);
    }
}
