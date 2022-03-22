package com.github.andredlima23.cidadesapi.countries.repositories;

import com.github.andredlima23.cidadesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
