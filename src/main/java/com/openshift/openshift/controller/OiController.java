package com.openshift.openshift.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("openshift")
public class OiController {
    @GetMapping("/oi")
    public String oi() {
//         for(int i=0; i < 10000; i++){
//             System.out.println("Perdi tempo "+i);
//         }
        return "Oi openshift";
    }
}
