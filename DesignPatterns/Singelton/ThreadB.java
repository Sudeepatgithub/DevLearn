package DesignPatterns.Singelton;

public class ThreadB extends Thread {
    @Override
    public void run() {
        SingletonClient.getClient().loop();
    }
}
