package DsAlgo.queues;

public class Queue {
/*
    private int maxSize;
    private long qArray[];
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        this.maxSize = size;
        this.qArray = new long[maxSize];
        front = 0; //index position of the first slot the array
        rear = -1; //no item to be considered as the last item
        nItems = 0;
    }

    public void insert(long a){
        rear++;
        qArray[rear] = a;
        nItems++;
    }

    public long remove(){   //Remove from the front
        int pos = front;
        front++;
        nItems--;
        if(front==maxSize){
            front = 0; //Reuse the array again
        }
        return qArray[pos];
    }

    public boolean isEmpty(){
        return nItems==0;
    }

    public boolean isFull(){
        return maxSize-1 == nItems;
    }

    public long peekFront(){
        return qArray[front];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (long aQArray : qArray) {
            stringBuilder.append(aQArray).append(" ");
        }
        return stringBuilder.toString();
    }*/

    private int queue[];
    private int front;
    private int rear;
    private int max;
    private int nItems;

    private Queue(int max) {
        this.max = max;
        queue = new int[max];
        front = 0;
        rear = -1;
    }

    private void enqueue(int x) {
        if (!isFull()) {
            rear++;
            queue[rear] = x;
            nItems++;
            if (rear == max - 1) {     // We refill it from the star once we fill it up and it's not full
                rear = -1;
            }
        } else {
            System.out.println("Full");
        }
    }

    /*
    While performing dequeue we can either
    - shift all elements by one toward the front after deleting the array | shifting
    - Use it circular way

     */
    private int dequeue() {
        if (!isEmpty()) {
            int result = queue[front];
            front++;
            nItems--;
            return result;
        } else {
            System.out.println("Empty");
        }
        System.out.println();
        return -1;
    }

    private boolean isEmpty() {
        return nItems == 0;
    }

    private boolean isFull() {
        return nItems == max;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (long aQArray : queue) {
            stringBuilder.append(aQArray).append(" ");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        System.out.println(queue.dequeue());
        //queue.enqueue(10);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println(queue.dequeue());
        queue.enqueue(11);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
       // System.out.println(queue.toString());
    }
}
