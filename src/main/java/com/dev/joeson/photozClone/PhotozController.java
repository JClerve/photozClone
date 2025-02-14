package com.dev.joeson.photozClone;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PhotozController {

    private List<Photo> db = List.of(new Photo("1","Hello.jpg"));

    @GetMapping("/")
    public String hello(){
        return "Hello Pirana";
    }

    @GetMapping("/photo")
    public List<Photo> get(){
        return db;

    }
}
