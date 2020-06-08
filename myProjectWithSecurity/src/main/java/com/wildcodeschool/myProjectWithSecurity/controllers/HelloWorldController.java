package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String shield() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String avengers() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public List<String> nick() {

        List <String> town = new ArrayList<>();

        town.add("Nantes");
        town.add("Amsterdam");
        town.add("Barcelone");
        town.add("Berlin");
        town.add("Biarritz");
        town.add("Bordeaux");
        town.add("Bruxelles");
        town.add("Bucarest");
        town.add("Budapest");
        town.add("Dublin");
        town.add("La Loupe");
        town.add("Lille");
        town.add("Lisbon");
        town.add("Londres");
        town.add("Lyon");
        town.add("Madrid");
        town.add("Marseille");
        town.add("Milan");
        town.add("Orléans");
        town.add("Paris");
        town.add("Reims");
        town.add("Strasbourg");
        town.add("Toulouse");
        town.add("Tours");

        return town;
    }
}
