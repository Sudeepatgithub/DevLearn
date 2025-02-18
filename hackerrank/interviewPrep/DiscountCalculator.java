package hackerrank.interviewPrep;

import java.util.*;

public class DiscountCalculator {
    static class Customer {
        String name;
        int spend;
        int discountCount;
        int totalDiscount;
        public Customer(String name, int spend){
            this.name = name;
            this.spend = spend;
        }
        public boolean canTakeDiscount(int discount){
            int maxAllowedDiscount = 2 * spend/100;
            return discountCount < 3 && (totalDiscount + discount <= maxAllowedDiscount);
        }
    }

    static class Discount{
        String product;
        int amount;
        public Discount(String product, int amount){
            this.amount = amount;
            this.product = product;
        }
    }

    public static Map<String, List<Integer>> allocateDiscounts(List<Customer> customers, List<Discount> discounts){
        discounts.sort((a,b)->Integer.compare(a.amount,b.amount));
        PriorityQueue<Customer> pq = new PriorityQueue<>((a,b)->a.discountCount == b.discountCount ? Integer.compare(b.spend,a.spend) : Integer.compare(a.discountCount,b.discountCount));
        pq.addAll(customers);
        Map<String, List<Integer>> assignedDiscounts = new HashMap<>();
        for(Customer customer: customers){
            assignedDiscounts.put(customer.name,new ArrayList<>());
        }
        for(Discount discount: discounts){
            System.out.println(discount);
            while ((!pq.isEmpty())){
                Customer customer = pq.poll();
                if(customer.canTakeDiscount(discount.amount)){
                    assignedDiscounts.get(customer.name).add(discount.amount);
                    customer.totalDiscount += discount.amount;
                    customer.totalDiscount++;
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

        Map<String, List<Integer>> assignedDiscounts = allocateDiscounts(customers, discounts);

        // Print result
        for (Map.Entry<String, List<Integer>> entry : assignedDiscounts.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
