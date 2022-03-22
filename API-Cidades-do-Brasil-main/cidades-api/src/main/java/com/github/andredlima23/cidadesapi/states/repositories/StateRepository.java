package com.github.andredlima23.cidadesapi.states.repositories;

import com.github.andredlima23.cidadesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
