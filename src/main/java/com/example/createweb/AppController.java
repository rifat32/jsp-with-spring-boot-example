package com.example.createweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AppController {

    @RequestMapping({"/test"})
    public String test() {
        System.out.println("welcome ............. ************************");
return "test";
    }
    @RequestMapping({"/list-contact"})
    public String listContact(Model model) {
        ContactBusiness contactBusiness = new ContactBusiness();
        List<Contact> contactList = contactBusiness.getContactList();
        model.addAttribute("contacts",contactList);
        return "contact";
    }
}
