package br.edu.infnet.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.edu.infnet.test.modelo.entidade.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	EntityManagerFactory fac = Persistence.createEntityManagerFactory("pu");
    	EntityManager entityManager = fac.createEntityManager();
    	entityManager.getTransaction().begin();
    	Cliente cliente = new Cliente("Antonio Maria");
    	entityManager.persist(cliente);
    	entityManager.getTransaction().commit();
    	assertTrue(true);
    
    }
}
