package com.abdennebi.github;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Math.sqrt;

@RestController
public class HelloController {


    @GetMapping("")
    String sayHello() {
        return "Hello World ! -- v2 ";
    }


    @GetMapping("/expensive")
    String expensive() {

        double x = 0.0001;

        for (int i = 0; i <= 10000000; i++) {
            x += sqrt(x);
        }
        return "OK!";
    }

}
