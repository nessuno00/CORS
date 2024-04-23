package com.controlller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/name")

    public String getname(@RequestParam String name) {

        return name;

    }

    @PostMapping("/name")

    public String reversename(@RequestParam String name) {
        StringBuilder stringBuilder = new StringBuilder(name).reverse();


        return  reversename(name).toString();


    }
}