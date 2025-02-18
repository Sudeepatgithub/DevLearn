package design_patterns;

public class ThreadA extends Thread{
    @Override
    public void run() {
        SingletonClient.getClient().loop();
    }
}
