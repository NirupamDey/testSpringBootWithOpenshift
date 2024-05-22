package com.dockerforjavadevelopers.hello;

import java.util.Properties;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        Properties p = System.getProperties();
        String businessName = p.getProperty("businessName")); //property to get system
        return "Hello from Nirupam to the World of Openshift with business name ";
    }
    
}
