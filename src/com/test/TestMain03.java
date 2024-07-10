package com.test;

import static java.lang.System.out;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.model.Person;
import com.service.PersonService;

public class TestMain03 {

    public static void main(String[] args) {
        List<String> messageList = new ArrayList<String>();
        Person personData = PersonService.getPersonData();

        Class<Person> personClass = Person.class;
        String result = null;
        for (int i = 1; i <= 10; i++) {
            result = null;
            try {
                Method method = personClass.getMethod(String.format("getMessage%02d", i));
                result = (String) method.invoke(personData);
            } catch (Exception e) {
                e.printStackTrace();
            }
            messageList.add(result);
        }

        out.println(messageList);
        out.println("TestMain03");
    }

}
