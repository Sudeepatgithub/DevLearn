package DesignPatterns.Singelton;

public class ThreadC extends Thread {
    @Override
    public void run() {
        SingletonClient.getClient().loop();
    }
}
