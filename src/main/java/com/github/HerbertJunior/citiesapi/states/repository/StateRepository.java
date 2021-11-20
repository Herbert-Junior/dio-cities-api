package com.github.HerbertJunior.citiesapi.states.repository;

import com.github.HerbertJunior.citiesapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository  extends JpaRepository<State, Long> {
}
