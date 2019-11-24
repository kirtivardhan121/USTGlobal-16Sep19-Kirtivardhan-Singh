package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.product;

public class GetReference {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		//		getReference() method is use to retrieve data from database
		product productDetails = entityManager.getReference(product.class, 11);
		System.out.println(productDetails.getPid());
		System.out.println(productDetails.getPname());
		System.out.println(productDetails.getQuantity());
		entityManager.close();

	}//end of main()

}//end of GetReference
