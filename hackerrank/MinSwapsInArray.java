package hackerrank;
import java.io.*;
import java.util.*;

public class MinSwapsInArray {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int count=0;
        int mid = arr.length/2;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==i+1){
                continue;
            }else {
                swap(arr,i,arr[arr[i-1]]);
                i--;
                count++;
            }
        }
        return count;
    }

    private static void swap(int[]arr,int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

