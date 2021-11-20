package com.github.HerbertJunior.citiesapi.countries;

import com.github.HerbertJunior.citiesapi.countries.Country;
import com.github.HerbertJunior.citiesapi.countries.repository.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    private CountryRepository repository;

    public CountryResource(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Page<Country> countries(Pageable page) {
        return repository.findAll(page);
    }

    @GetMapping("/{id}")
    public Optional<Country> getOne(@PathVariable Long id)
    {
        if(!repository.findById(id).isPresent()){
            return Optional.empty();
        }else{
            return repository.findById(id);
        }
    }
}
