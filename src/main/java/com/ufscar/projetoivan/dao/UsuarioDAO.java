/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufscar.projetoivan.dao;

import com.ufscar.projetoivan.model.Usuario;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author Michel
 */
public class UsuarioDAO {
    
    @Inject
    private EntityManager em;


    public Usuario salvar(Usuario usuario) {
        usuario = em.merge(usuario);
        return usuario;
    }

    public List<Usuario> buscarTodos() {
        return em.createQuery("SELECT u FROM Usuario u").getResultList();
    }

    public List<Usuario> buscarEspecifico(String palavra) {
        return em.createQuery("SELECT u FROM Usuario u "
                + "WHERE u.email LIKE '%" + palavra + "%' ", Usuario.class)
                .getResultList();
    }

  
    public void excluir(Long id) {
        Usuario usuario = em.find(Usuario.class, id);
        em.remove(usuario);
        em.flush();
    }
    
}
