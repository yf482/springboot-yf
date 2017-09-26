package com.yf.springboot.springbootwebdemo.controller;

import com.google.gson.Gson;
import com.yf.springboot.springbootwebdemo.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/person")
public class PersonController {
    @RequestMapping("/getPerson")
    @ResponseBody
    public String getPerson(Person person){
        Gson gson = new Gson();
        String ret = gson.toJson(person);
        return ret;
    }


    @RequestMapping("/getPersons")
    public String getPersonList(Model model){
        Person person = new Person("haha",123);
        List<Person> personList = new ArrayList<Person>();
        personList.add(person);
        personList.add(person);

        model.addAttribute("person",person);
        model.addAttribute("personList",personList);
        return "person";

    }
}
