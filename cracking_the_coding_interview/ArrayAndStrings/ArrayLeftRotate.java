package cracking_the_coding_interview.ArrayAndStrings;

import java.util.Scanner;

public class ArrayLeftRotate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int rotateFactor = scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        int newArr[]=new int[size];
        for (int i=0;i<size;i++) {
            newArr[calculatePosition(i, size, rotateFactor)] = arr[i];
        }
        for(int i=0;i<size;i++){
            System.out.print(newArr[i]+" ");
        }
    }

    private static int calculatePosition(int index, int size, int rotateFactor) {
        if(index-rotateFactor<0){
            return index-rotateFactor+size;
        }
        else return index-rotateFactor;
    }
}
