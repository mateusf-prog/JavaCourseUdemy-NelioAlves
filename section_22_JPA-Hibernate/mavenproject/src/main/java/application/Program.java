package application;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test-PU");
        EntityManager em = emf.createEntityManager();

        Pessoa p = em.find(Pessoa.class, 3);

        System.out.println(p);
        System.out.println("Done!");

    }
}
