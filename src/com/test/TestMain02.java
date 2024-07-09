package com.test;

import static java.lang.System.out;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.model.Person;
import com.service.PersonService;

public class TestMain02 {

    public static void main(String[] args) {
        List<String> messageList = new ArrayList<String>();
        Person personData = PersonService.getPersonData();

        Class<Person> personClass = Person.class;
        String result = null;
        for (int i = 1; i <= 10; i++) {
            try {
                Method method = personClass.getMethod(String.format("getMessage%02d", i));
                result = (String) method.invoke(personData);
            } catch (NoSuchMethodException e) {
                System.out.println("#1");
                e.printStackTrace();
            } catch (SecurityException e) {
                System.out.println("#2");
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                System.out.println("#3");
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                System.out.println("#4");
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                System.out.println("#5");
                e.printStackTrace();
            }
            messageList.add(result);
        }

        out.println(messageList);
        out.println("TestMain02");
    }

}
