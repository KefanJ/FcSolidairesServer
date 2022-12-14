package org.formation.hibernate.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.formation.hibernate.entity.Club;
import org.formation.hibernate.entity.Joueur;

public class TestClubPersist {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			//Club c1 = new Club("FC SOLIDAIRES", 2L, 8L, 2l, 20L, 28l);
			Club c2 = new Club("FC SOLIDAIRES", 2, 8, 2, 20, 28);
			Club c3 = new Club("PSG", 56, 8, 2, 29, 22);
			Club c4 = new Club("LIVERPOOL", 20, 80, 26, 28, 45);
			
			Joueur j1 = new Joueur("KEFAN", 6, c2, 7, 50, 3, 0, 0);
			Joueur j2 = new Joueur("LEO", 6, c4, 9, 2, 8, 0, 0);
	
			if(j1.getBut() > j1.getClub().getNbrButMarquer()) {
				System.out.println("Ajout impssible ! ");
			}
			else {
				em.persist(j1);
			}
		
			//em.persist(c1);
			em.persist(c2);
			em.persist(c3);
			em.persist(c4);
			
			
			em.persist(j2);
			
			

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
