/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufscar.projetoivan.dao;

import com.ufscar.projetoivan.jpa.Transactional;
import com.ufscar.projetoivan.model.Empresa;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Michel
 */
@Stateless
public class EmpresaDAO {

    @PersistenceContext
    private EntityManager em;

    public Empresa salvar(Empresa empresa) {
        System.out.println("empresa  " + empresa.getNome());
        empresa = em.merge(empresa);
        return empresa;
    }

    public List<Empresa> buscarTodos() {
        return em.createQuery("SELECT e FROM Empresa e").getResultList();
    }

    public List<Empresa> buscarEspecifico(String palavra) {
        return em.createQuery("SELECT e FROM Empresa e "
                + "WHERE e.nome LIKE :palavra", Empresa.class)
                .setParameter("palavra", "%" + palavra + "%")
                .getResultList();
    }

    public void excluir(Long id) {
        Empresa e = em.find(Empresa.class, id);
        em.remove(e);
        em.flush();
    }
}
