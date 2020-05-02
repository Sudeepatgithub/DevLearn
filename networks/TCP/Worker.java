package networks.TCP;

import java.io.*;
import java.net.Socket;

public class Worker implements Runnable {

    private Socket socket;
    public Worker(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            // Using DataInput and DataOutput Streams for transmitting data in binary form
            int num1 = Integer.parseInt(dataInputStream.readUTF());
            int num2 = Integer.parseInt(dataInputStream.readUTF());
            System.out.println("Received Numbers: " + num1 + " "+ num2);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeBytes("Your output is: <"+ num1*num2+">");
            dataInputStream.close();
            dataOutputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
