package design_patterns;

public class ThreadC extends Thread {
    @Override
    public void run() {
        SingletonClient.getClient().loop();
    }
}
