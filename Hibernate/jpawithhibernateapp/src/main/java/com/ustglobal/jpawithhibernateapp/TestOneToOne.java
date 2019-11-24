package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.onetoone.Person;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterCard;

public class TestOneToOne {

	public static void main(String[] args) {

		VoterCard vc = new VoterCard();
		vc.setVid(17);
		vc.setVname("Raveena");

		Person person = new Person();
		person.setPid(8);
		person.setPname("Raveena");
		person.setVcard(vc);

		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			VoterCard vcard = entityManager.find(VoterCard.class, 10);
			System.out.println(vcard.getPerson().getPid());
			System.out.println(vcard.getPerson().getPname());
			entityManager.persist(person);
			System.out.println("Record Saved");
			entityTransaction.commit();

		} catch (Exception e) {

			e.printStackTrace();
			entityTransaction.rollback();

		}//end of try catch
		entityManager.close();


	}//end of main()

}//end of TestOneToOne
