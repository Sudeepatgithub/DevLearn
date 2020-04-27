package DsAlgo.search;

public class BinarySearch {

    private int arr[];
    private int find;

    public BinarySearch(int arr[], int find) {
        this.arr = arr;
        this.find = find;
    }


    public int binarySearch() {
        int p = 0;
        int r = arr.length - 1;
        int q = (p + r) / 2;
        while (p <= r) {
            if (arr[q] == find) {
                return q;
            }
            if (arr[q] > find) {
                r = q-1;
            }else {
                p = q+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch(new int[]{1,2,3,4,5,5,6,7},4);
        System.out.println(binarySearch.binarySearch());
    }
}
