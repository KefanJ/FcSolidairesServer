package org.formation.hibernate.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.formation.hibernate.entity.Club;

public class TestClubPersist {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			//Club c1 = new Club("FC SOLIDAIRES", 2L, 8L, 2l, 20L, 28l);
			Club c2 = new Club("FC SOLIDAIRES", 2L, 8L, 2l, 20L, 28l);
			Club c3 = new Club("PSG", 56L, 8L, 2l, 29L, 22l);
			Club c4 = new Club("LIVERPOOL", 20L, 80L, 26l, 28L, 45l);
	
			//em.persist(c1);
			em.persist(c2);
			em.persist(c3);
			em.persist(c4);
			
			
			

			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
	}
}
