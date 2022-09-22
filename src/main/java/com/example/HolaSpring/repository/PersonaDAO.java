package com.example.HolaSpring.repository;

import com.example.HolaSpring.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDAO extends CrudRepository<Persona, Long> {
}
