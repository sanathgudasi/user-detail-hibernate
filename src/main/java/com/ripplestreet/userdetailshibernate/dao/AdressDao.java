package com.ripplestreet.userdetailshibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ripplestreet.userdetailshibernate.dto.Adress;
import com.ripplestreet.userdetailshibernate.dto.PersonInfo;
import com.ripplestreet.userdetailshibernate.exception.UserDetailsHibernateException;
import com.ripplestreet.userdetailshibernate.repository.AdressRepository;

public class AdressDao implements AdressRepository {

	@Override
	public void saveAdress(PersonInfo info) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("user_details");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.merge(info);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
}

