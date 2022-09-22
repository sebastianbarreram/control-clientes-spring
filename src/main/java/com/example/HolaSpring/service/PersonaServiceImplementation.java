package com.example.HolaSpring.service;

import com.example.HolaSpring.model.Persona;
import com.example.HolaSpring.repository.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaServiceImplementation implements PersonaService {
    @Autowired
    private PersonaDAO personaDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Persona> listarPersonas() {
        return (List<Persona>) personaDAO.findAll();
    }

    @Override
    @Transactional
    public void guardarPersona(Persona persona) {
        personaDAO.save(persona);
    }

    @Override
    @Transactional
    public void eliminarPersona(Persona persona) {
        personaDAO.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersonas(Persona persona) {
        return personaDAO.findById(persona.getIdPersona()).orElse(null);
    }
}
