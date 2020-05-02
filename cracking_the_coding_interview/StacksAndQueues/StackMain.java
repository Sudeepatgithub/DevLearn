package cracking_the_coding_interview.StacksAndQueues;

public class StackMain {
    public static void main(String[] args) {
        StackWithMin stackWithMin = new StackWithMin();
        stackWithMin.push(10);
        stackWithMin.push(11);
        stackWithMin.push(12);
        System.out.println(stackWithMin.pop());
        System.out.println(stackWithMin.min());
    }
}
