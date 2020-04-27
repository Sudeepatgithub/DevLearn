package DesignPatterns.Singelton;

public class ThreadA extends Thread{
    @Override
    public void run() {
        SingletonClient.getClient().loop();
    }
}
