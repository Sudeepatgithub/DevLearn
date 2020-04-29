package DsAlgo.search;

public class BinarySearch {

    private int[] arr;

    private BinarySearch(int[] arr) {
        this.arr = arr;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch(new int[]{1, 2, 3, 4, 5, 5, 6, 7});
        System.out.println(binarySearch.search(7));
        System.out.println(binarySearch.recSearch(binarySearch.arr,0, binarySearch.arr.length,17));

    }

    private int search(int x) {
        int p = 0;
        int r = arr.length;
        int q;
        while (p < r) {
            q = (p + r) / 2;
            if (arr[q] == x) {
                return q;
            }
            else if (x < arr[q]) {
                r = q - 1;
            }
            else {
                p = q + 1;
            }
        }
        return -1;
    }

    private int recSearch(int[] arr, int p, int r, int find) {
        if (arr.length == 0) {
            return -1;
        }
        if (p >= r) {
            return -1;
        }
        else {
            int q = (p + r) / 2;
            if (arr[q] == find) {
                return q;
            }
            else if (arr[q] > find) {
                return recSearch(arr, p, q - 1, find);
            }
            else {
                return recSearch(arr, q + 1, r, find);
            }
        }
    }
}
