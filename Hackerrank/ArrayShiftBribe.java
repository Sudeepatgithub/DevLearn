package Hackerrank;

import java.util.Scanner;

public class ArrayShiftBribe {
    static void minimumBribes(int[] q) {
        int size = q.length;
        int arr[]=new int[size];
        int sum=0;
        for(int i=0;i<size;i++){
            arr[i]=i+1;
            int diff = Math.abs(arr[i]-q[i]);
            if(diff>=3){
                System.out.print("Too chaotic");
                return;
            }
            for(int j=Math.max(0,q[i]-2);j<i;j++){
                if(q[j]>q[i]) sum++;
            }
        }
        System.out.println(sum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
