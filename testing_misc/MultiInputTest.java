package testing_misc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MultiInputTest {
    public static void main(String[] args) {
        List<Date> list = new ArrayList<Date>();
        ArrayList<Date> arrayList = new ArrayList<Date>();
        Date date = new Date();
        Date date1 = new Date();
        Date date2= new Date();
        Date[]dates = {date,date1};
        MultiInputTest test = new MultiInputTest();
        test.a(dates);
    }

    public void a(Date... dates){

    }
}
