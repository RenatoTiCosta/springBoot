package com.spring.jpa_spring.otica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class OticaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Pesquisar

    //Olha essas integrações:

    private Integer id;

    private String name;

    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


//
  //  public oticaEntity salvar(oticaEntity dados) {
    //    return dados;
    //}

    //public void excluir(Integer id) {
    //}

    //public oticaEntity buscarId(Integer id) {
    //}
//}
//