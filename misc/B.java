package misc;

import java.io.IOException;
import java.util.concurrent.Callable;

public class B implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(4000);
        return "Sudeep";
    }

    public void oovv(){

    }
}
