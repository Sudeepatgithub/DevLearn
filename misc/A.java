package misc;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class A  extends B{
    public static void main(String[] args) {
        B b = new B();
        FutureTask<String> futureTask = new FutureTask<>(b);
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    static void calll()throws IOException{
        ma();
    }
    static void ma()throws IOException {
        throw new IOException();
    }

    @Override
    public void oovv()  {

    }
}
