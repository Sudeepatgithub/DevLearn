package hackerrank;
import java.io.*;
import java.util.*;

public class PesoProblem {

    /*
     * Complete the howMuchToAsk function below.
     */
	private static final Set<Integer> denominations = new HashSet<>();
	
    static int howMuchToAsk(int c, int p) {
        /*
         * Return the amount the cashier should ask the customer or -1 if this exceeds 9.
         */if(denominations.contains(p-c)) {
        	 return 0;
         }
         int diff = p-c;
         int last = diff%10; 
         if(10-last>9) {
        	 return -1;
         }
		return 10-last;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	denominations.add(20);
    	denominations.add(50);
    	denominations.add(100);
    	denominations.add(200);
    	denominations.add(500);
    	denominations.add(1000);
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int t = Integer.parseInt(scan.nextLine().trim());
        for (int tItr = 0; tItr < t; tItr++) {
            String[] cp = scan.nextLine().split(" ");

            int c = Integer.parseInt(cp[0].trim());

            int p = Integer.parseInt(cp[1].trim());

            int result = howMuchToAsk(c, p);

            bw.write(String.valueOf(result));
            bw.newLine();
        }

        bw.close();
    }
}
