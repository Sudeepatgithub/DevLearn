package hackerrank;


public class BankRequests {
    public static void main(String[] args) {

    }

    private static void transact(int accounts[], String strs[]){
        for(String req: strs){
            String request[] = req.split(" ");
            int i = Integer.parseInt(request[1]);
            int j = Integer.parseInt(request[2]);
            switch (request[0]){
                case "transfer":
                    int amount = Integer.parseInt(request[3]);
            }
        }
    }
}
