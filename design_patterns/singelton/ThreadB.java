package design_patterns.singelton;

public class ThreadB extends Thread {
    @Override
    public void run() {
        SingletonClient.getClient().loop();
    }
}
