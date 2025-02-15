package com.dev.joeson.photozClone;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PhotozController {

    private Map<String,Photo> db = new HashMap(){{
        put("1",new Photo("1","Hello.jpg"));
    }};

  //  private List<Photo> db = List.of();

    @GetMapping("/")
    public String hello(){
        return "Hello Pirana";
    }

    @GetMapping("/photo")
    public Collection<Photo> get(){
        return db.values();

    }

    @GetMapping("/photo/{id}")
    public Photo get(@PathVariable String id){
        return db.get(id);

    }
}
