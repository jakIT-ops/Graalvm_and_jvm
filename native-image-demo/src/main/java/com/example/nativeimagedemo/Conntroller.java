package com.example.nativeimagedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Conntroller {



    @GetMapping
    String hello(){
        TestClass.main();
        return "done";
    }
}
