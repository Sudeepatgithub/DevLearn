package design_patterns.singelton;

public class ThreadA extends Thread{
    @Override
    public void run() {
        SingletonClient.getClient().loop();
    }
}
