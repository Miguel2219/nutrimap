package com.nutrimap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador de prueba para verificar funcionamiento
 */
@RestController
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "NutriMAP API - Sistema funcionando correctamente";
    }
    
    @GetMapping("/test")
    public String test() {
        return "Endpoint de prueba funcionando";
    }
}
