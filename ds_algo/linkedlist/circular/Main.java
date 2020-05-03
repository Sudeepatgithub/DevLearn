package ds_algo.linkedlist.circular;

public class Main {
    int j=0;
    public static void main(String[] args) {
        CircularList circularList = new CircularList();
        circularList.insertFirst(10);
        circularList.insertFirst(20);
        circularList.displayList();
        circularList.deleteLast();
        System.out.println();
        circularList.displayList();
    }

}
