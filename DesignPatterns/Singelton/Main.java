package DesignPatterns.Singelton;

public class Main {
    public static void main(String[] args) {
        ThreadA threadA =new ThreadA();
        threadA.setName("A");
        ThreadB threadB = new ThreadB();
        threadB.setName("B");
        ThreadC threadC = new ThreadC();
        threadC.setName("C");
        threadA.start();
        threadB.start();
        threadC.start();
    }

}
