package com.enigma.camp.tokonyakamu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping(path = "/hello")
    public String hello(){
        return "<h1> Hello word</h1>";
    }

    @GetMapping(value = "/request-pram{key}")
    public String getRequestParam(@RequestParam String key){
        return key;
    }

    @GetMapping("/person/{id}")
    public String getPersonId(@PathVariable String id){
        return "Person" + id;

    }
    @GetMapping("/person")
    public Map<String, Object> getPerson() {

        Map<String, String> detail = new HashMap<>();
        detail.put("rt", "08");
        detail.put("rw", "04");
        detail.put("street","Jl. H. Dahlan" );

        Map<String, Object> adresses = new HashMap<>();
        adresses.put("adress", detail);

        String[] hobby = {"Iidur", "Ibadah"};
        Map<String, Object> hobbies = new HashMap<>();
        hobbies.put("hobbies", hobby );

        Map<String, Object> person = new HashMap<>();

        person.put("name","Edy");
        person.put("is_married",false);
        person.put("name",17);


//        person.put("name", "Wildan");
//        person.put("age", 18);
//        person.put("status", "bebas");
        return person;
    }
}
