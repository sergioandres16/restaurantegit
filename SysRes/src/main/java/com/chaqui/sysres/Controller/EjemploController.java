package com.chaqui.sysres.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@Controller
@CrossOrigin("*")
@RequestMapping("/ejemplo")
public class EjemploController {
    @GetMapping("/ver")
    public ResponseEntity get(){
        HashMap<String,String> response = new HashMap<>();
        response.put("msj","funciona!");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
