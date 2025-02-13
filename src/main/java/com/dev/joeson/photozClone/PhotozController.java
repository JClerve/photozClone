package com.dev.joeson.photozClone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhotozController {

    @GetMapping("/")
    public String hello(){
        return "Hello Pirana";
    }
}
