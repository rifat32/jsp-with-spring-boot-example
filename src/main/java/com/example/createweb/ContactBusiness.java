package com.example.createweb;

import java.util.ArrayList;
import java.util.List;

public class ContactBusiness {
    public List<Contact> getContactList () {
        List<Contact> listContact = new ArrayList<>();
        listContact.add(new Contact("name","email","country"));
        listContact.add(new Contact("name","email","country"));
        listContact.add(new Contact("name","email","country"));
        listContact.add(new Contact("name","email","country"));
        listContact.add(new Contact("name","email","country"));
        listContact.add(new Contact("name","email","country"));
        return listContact;
    }


}
