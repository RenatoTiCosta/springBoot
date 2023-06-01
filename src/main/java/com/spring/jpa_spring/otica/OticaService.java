package com.spring.jpa_spring.otica;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OticaService {
    private OticaRepository repository;

    public OticaService(OticaRepository repository) {
        this.repository = repository;

    }

    public OticaEntity salvar(OticaEntity dados) {
        return repository.save(dados);
    }

    public List<OticaEntity> listarTodos() { //chamar  list quando for lista sem paramentros
        return (List<OticaEntity>) repository.findAll();
    }

    public void excluir(Integer id) {
        repository.deleteById(id);
    }

    public OticaEntity buscarId(Integer id) {
        return repository.findById(id).get();
    }
}