package com.example.HolaSpring.service;

import com.example.HolaSpring.model.Persona;
import org.aspectj.weaver.patterns.PerObject;

import java.util.List;

public interface PersonaService {
    public List<Persona> listarPersonas();

    public void guardarPersona(Persona persona);

    public void eliminarPersona(Persona persona);

    public Persona encontrarPersonas(Persona persona);

}
