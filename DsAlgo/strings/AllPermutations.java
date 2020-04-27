package DsAlgo.strings;


import java.util.Scanner;

/**
 *
 * Given a string, print all permutations of a given string.

 Input:

 The first line of input contains an integer T denoting the number of test cases.
 Each test case contains a single string in capital letter.

 Output:

 Print all permutations of a given string with single space and all permutations should be in lexicographically increasing order.

 Constraints:

 1 ≤ T ≤ 10
 1 ≤ size of string ≤ 5


 Input:
 1
 ABC
 Output:
 ABC ACB BAC BCA CAB CBA
*/
public class AllPermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        for(int q=0;q<t;q++) {
            String str = scanner.next();

        }
    }
}
