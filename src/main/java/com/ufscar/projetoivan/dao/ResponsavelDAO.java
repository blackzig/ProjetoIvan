/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufscar.projetoivan.dao;

import com.ufscar.projetoivan.model.Responsavel;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author Michel A. Medeiros
 */
public class ResponsavelDAO implements Serializable {

    @Inject
    private EntityManager em;

  
    public Responsavel salvar(Responsavel responsavel) {
        responsavel = em.merge(responsavel);
        return responsavel;
    }

    public List<Responsavel> buscarTodosOsEmpregadores() {
        return em.createQuery("SELECT r FROM Responsavel r").getResultList();
    }

    public List<Responsavel> buscarEspecifico(String palavra) {
        return em.createQuery("SELECT r FROM Responsavel r "
                + "WHERE r.nome LIKE '%" + palavra + "%' ", Responsavel.class)
                .getResultList();
    }


}
