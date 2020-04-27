package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class MainClass {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException {
        ReflectionObj reflectionObj = new ReflectionObj();

        Class cls = reflectionObj.getClass();
        Constructor constructor = cls.getConstructor();

        System.out.print(constructor.getName());
        cls.getMethods();
        Field field = cls.getField("abc");
        field.setAccessible(true);
        field.set(reflectionObj,"Sudeep");
        reflectionObj.printData();
    }
}
