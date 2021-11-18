package com.github.HerbertJunior.citiesapi.repository;

import com.github.HerbertJunior.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
