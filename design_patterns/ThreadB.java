package design_patterns;

public class ThreadB extends Thread {
    @Override
    public void run() {
        SingletonClient.getClient().loop();
    }
}
