package com.test;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

import com.model.Person;
import com.service.PersonService;

public class TestMain {

    public static void main(String[] args) {
        List<String> messageList = new ArrayList<String>();
        Person personData = PersonService.getPersonData();

        // 這段程式不知道怎麼簡化.
        messageList.add(personData.getMessage01());
        messageList.add(personData.getMessage02());
        messageList.add(personData.getMessage03());
        messageList.add(personData.getMessage04());
        messageList.add(personData.getMessage05());
        messageList.add(personData.getMessage06());
        messageList.add(personData.getMessage07());
        messageList.add(personData.getMessage08());
        messageList.add(personData.getMessage09());
        messageList.add(personData.getMessage10());

        out.println(messageList);
    }

}
