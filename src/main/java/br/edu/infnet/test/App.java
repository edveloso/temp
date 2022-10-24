package br.edu.infnet.test;

import br.edu.infnet.test.modelo.entidade.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	EntityManagerFactory fac = Persistence.createEntityManagerFactory("pu");
    	EntityManager entityManager = fac.createEntityManager();
    	entityManager.getTransaction().begin();
    	Cliente cliente = new Cliente("Antonio Maria");
    	entityManager.persist(cliente);
    	entityManager.getTransaction().commit();
    
    }
}
