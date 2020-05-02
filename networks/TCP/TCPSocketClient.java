package networks.TCP;

import java.io.*;
import java.net.Socket;
import java.util.Random;

/**
 * A simple class that opens a socket, sends a message to the server, and
 * terminates.
 * @author Graeme Stevenson (graeme.stevenson@ucd.ie)
 */
public class TCPSocketClient {

    /**
     * The server host name.
     */
    public String my_serverHost;

    /**
     * The server port.
     */
    public int my_serverPort;

    /**
     * Sets the client up with the server details.
     * @param the_serverHost the server host name.
     * @param the_serverPort the server port.
     */
    public TCPSocketClient(String the_serverHost, int the_serverPort) {
        my_serverHost = the_serverHost;
        my_serverPort = the_serverPort;
    }

    /**
     * Creates a connection to the server and sends a message.
     * @param a_message the message to send to the server.
     */
    public void sendMessage(String a_message) {
        try {
            int count=0;
            while (count<100) {
                count++;
                Socket toServer = new Socket(my_serverHost, my_serverPort);
                DataOutputStream dataOutputStream = new DataOutputStream(toServer.getOutputStream());   // Using DataInput and DataOutput Streams for transmitting data in binary form
                InputStream inputStream = toServer.getInputStream();
                Random random = new Random();   //Generating Random numbers with range 0 to 100
                int num1 = random.nextInt(100);
                int num2 = random.nextInt(100);
                dataOutputStream.writeUTF(num1+"");
                dataOutputStream.writeUTF(num2+"");
                DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream));
                String line = dataInputStream.readLine();
                if ((line) != null) {
                    System.out.println(line);
                }
                inputStream.close();
                dataOutputStream.close();
                toServer.close();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }


    /**
     * Parse the arguments to the program, create a socket, and send a message.
     * @param args the program arguments. Should take the form &lt;host&gt;
     *           &lt;port&gt; &lt;message&gt;
     */
    public static void main(String[] args) {

        String host = null;
        int port = 0;
        String message = null;

        // Check we have the right number of arguments and parse
        if (args.length == 3) {
            host = args[0];
            try {
                port = Integer.valueOf(args[1]);
            } catch (NumberFormatException nfe) {
                System.err.println("The value provided for the port is not an integer");
                nfe.printStackTrace();
            }
            message = args[2];

            // Create the client
            TCPSocketClient client = new TCPSocketClient(host, port);
            // Send a message using the client
            client.sendMessage(message);
            while (true){

            }
        } else {
            System.out.println("Usage: java TCPSocketClient <host> <port> <message>");
        }

    }
} // end class

