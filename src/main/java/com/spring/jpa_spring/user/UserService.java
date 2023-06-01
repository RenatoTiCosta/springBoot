package com.spring.jpa_spring.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;

    }
    public User salvar (User informacoes) {
        return repository.save(informacoes);
    }
    public List<User> listarTodos () { //chamar  list quando for lista sem paramentros
        return (List<User>) repository.findAll();
    }
    public void excluir (Integer id) {
        repository.deleteById(id);
    }
    public User buscarId (Integer id) {
        return repository.findById(id).get(); //comentario findById quando for buscar Id .get() Pesquisar.
    }





}
