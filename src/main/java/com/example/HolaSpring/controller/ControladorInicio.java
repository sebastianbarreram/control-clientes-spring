package com.example.HolaSpring.controller;

import com.example.HolaSpring.model.Persona;
import com.example.HolaSpring.service.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@Slf4j
public class ControladorInicio {
    @Autowired
    private PersonaService personaService;

    @GetMapping("/")
    public String inicio(Model model) {
        List<Persona> personas = personaService.listarPersonas();
        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("personas", personas);
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Persona persona) {
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(Persona persona) {
        personaService.guardarPersona(persona);
        return "redirect:/";
    }

}
