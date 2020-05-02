package design_patterns.singelton;

public class SingletonClient {

    public static SingletonClient client;

    private SingletonClient(){

    }

    public static synchronized SingletonClient getClient(){
        if(client==null){
            client = new SingletonClient();
        }
        return client;
    }

    public void loop(){
        Thread cT = Thread.currentThread();
        for (int i=0;i<1000000;i++)
        System.out.print(cT.getName()+" Running\n");

    }
}
