package com.DateInterfaceLesson9.Date.Annotation;
//Написать программу, которая будет анализировать присутствие аннотации над классом MyService и если она присутствует - создавать экземпляр этого класса,
//        задавать значения его полям и вызывать метод thisClassInfo (использовать возможности пакета reflection).

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {
    private static int id = 10;
    private static String name = "beta";

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        MyService myService = new MyService();
        Annotation[] annotation = myService.getClass().getAnnotations();
        if (annotation.length != 0) {
            myService.setId(id);
            myService.setName(name);
            try {
                Method method = myService.getClass().getDeclaredMethod("thisClassInfo");
                method.setAccessible(true);
                method.invoke(myService);
            } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
