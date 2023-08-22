package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NameControler {
    private List<Person> personList =new ArrayList<>();
    @PostMapping("/add")
    public void addName(@RequestBody Person person) {
        this.personList.add(person);
    }

    @GetMapping("/show")
    public List<Person> getPersonNames(){
      return this.personList;
    }

}
