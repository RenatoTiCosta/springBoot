package com.spring.jpa_spring.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController // comentario que informa que é um controle = controlador entre o cliente e o
                // usuário. (Engenheiro da obra (Controller) passa para os outros serviços)
@RequestMapping ("/controlador")  // Comentario que faz o padrão da URL http://... caminho do arquivo
                  //  Essa anotação permite definir o padrão de URL e o método HTTP que o método
                    //  do controlador irá tratar.




public class UserController {
    @Autowired // comentário do Contrutor
    private UserService userService;

    @PostMapping("/add")
    public User criar (@RequestBody User informacoes) { // coloca Request pesquisar
        return userService.salvar(informacoes);
    } // comentario relacionado a entidade

    @GetMapping("/todos")
        public List <User> listar () {
        return userService.listarTodos();
    }
    @DeleteMapping("/{id}")// chamar comentario delete
    public void deletar (@PathVariable Integer id) { //comentario paramentro relacionado ao seu id
        userService.excluir(id);
    }
    @GetMapping("/buscar/{id}") // eu decido o caminho
    public User buscar (@PathVariable Integer id) { //SEMPRE ID comentario paramentro relacionado ao seu id
        return userService.buscarId(id);
    }

}
