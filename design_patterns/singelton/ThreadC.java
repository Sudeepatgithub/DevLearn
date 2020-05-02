package design_patterns.singelton;

public class ThreadC extends Thread {
    @Override
    public void run() {
        SingletonClient.getClient().loop();
    }
}
