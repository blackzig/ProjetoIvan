package empresa;

import com.ufscar.projetoivan.model.Empresa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Michel
 */
public class CadastrarEmpresa {

    public static void main(String args[]) {
        try {

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoIvanPU");
            EntityManager em = emf.createEntityManager();
            Empresa empresa = new Empresa();
            empresa.setNome("teste3");
            em.getTransaction().begin();
            empresa = em.merge(empresa);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }

    }

}
