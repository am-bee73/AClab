package com.ac.controllers;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String sayHello() throws UnknownHostException {
        String ip = InetAddress.getLocalHost().getHostAddress();
        return "Hello AM! We are on: " + ip;
    }
}
