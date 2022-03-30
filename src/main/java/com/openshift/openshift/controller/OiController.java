package com.openshift.openshift.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("openshift")
public class OiController {
    @GetMapping("/oi")
    public String oi() {
        return "Oi openshift";
    }
    
    @PostMapping("/ola")
    public @ResponseBody ResponseEntity<String> post(@RequestBody String nome) {
        return new ResponseEntity<String>("Olá "+nome, HttpStatus.OK);
    }
}
