package com.spring.jpa_spring.otica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController // add esse comentário
@RequestMapping("/control") // CAMINHO, aqui onde é o endereço para localizar

// DECLARAR A CLASSE CONTROLER
public class OticaController { // ver se precisa ser  Otica
    @Autowired // Comentário do construtor.
    private OticaService oticaService;

    // CRIAR DADOS
    @PostMapping("/add") // Criar novo dado adicionar
    public OticaEntity criar (@RequestBody OticaEntity dados) { // Add RequestBory no paramentro
        return oticaService.salvar(dados);
    }
    //LISTAR TODOS OS DADOS
    @GetMapping("/todos") //Pesquisar todos
    public List <OticaEntity> listar () {
        return oticaService.listarTodos();
    }
    //DELETAR
    @DeleteMapping("/{id}")
    public void deletar (@PathVariable Integer id) {
        oticaService.excluir(id); // não precisa de retorno.
    }
    //BUSCAR POR ID
    @GetMapping("/buscar/{id}")
    public OticaEntity buscar (@PathVariable Integer id) {
        return oticaService.buscarId(id);
    }

}