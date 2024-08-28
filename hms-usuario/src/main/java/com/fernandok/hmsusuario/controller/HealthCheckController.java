package com.fernandok.hmsusuario.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/health")
public class HealthCheckController {

    @GetMapping()
    public ResponseEntity<String> health(){
        Date date = new Date();
        return ResponseEntity.ok().body("[Server] Status: Status UP, Date: " + date);
    }
}
