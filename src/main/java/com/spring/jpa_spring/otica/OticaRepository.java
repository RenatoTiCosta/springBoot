package com.spring.jpa_spring.otica;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OticaRepository extends CrudRepository<OticaEntity, Integer> {
}