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

    private Queue(int max) {
        this.max = max;
        queue = new int[max];
        front = -1;
        rear = 0;
    }

    private void enqueue(int x){

    }
}
