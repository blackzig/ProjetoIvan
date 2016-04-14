/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufscar.projetoivan.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Michel A. Medeiros
 */
@Entity
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    
    private String email;
    private String senha;
    private String caminho_foto;
    private String caminho_foto_capa;
    private Character status;

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }
    
    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCaminho_foto() {
        return caminho_foto;
    }

    public void setCaminho_foto(String caminho_foto) {
        this.caminho_foto = caminho_foto;
    }

    public String getCaminho_foto_capa() {
        return caminho_foto_capa;
    }

    public void setCaminho_foto_capa(String caminho_foto_capa) {
        this.caminho_foto_capa = caminho_foto_capa;
    }
    
    

}
