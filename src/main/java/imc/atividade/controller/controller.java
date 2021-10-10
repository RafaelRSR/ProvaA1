package imc.atividade.controller;


import imc.atividade.service.service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

@RestController
public class controller {

    @GetMapping("/imc")
    public ResponseEntity<?> calculadora(@RequestParam Double peso, Double altura) {


        return ResponseEntity.ok(service.calculadora(peso,altura));
    }
}
