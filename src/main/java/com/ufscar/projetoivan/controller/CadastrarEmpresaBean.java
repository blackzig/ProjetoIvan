/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufscar.projetoivan.controller;

import com.ufscar.projetoivan.dao.EmpresaDAO;
import com.ufscar.projetoivan.model.Empresa;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Michel
 */
@ManagedBean(name = "cadastrarEmpresaBean")
@SessionScoped
public class CadastrarEmpresaBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;

    @EJB
    private EmpresaDAO empresaDAO;

    private Empresa empresa;

    public void cadastrarEmpresa() {
        try {
            System.out.println("nome " + nome);
            empresa = empresaDAO.salvar(empresa);
            System.out.println("salvou.......");
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
