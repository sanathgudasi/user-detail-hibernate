package com.ripplestreet.userdetailshibernate.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ripplestreet.userdetailshibernate.dto.PersonInfo;
import com.ripplestreet.userdetailshibernate.exception.UserDetailsHibernateException;
import com.ripplestreet.userdetailshibernate.repository.PersonInfoRepository;

public class PersonInfoDao implements PersonInfoRepository {


	@Override
	public void savePersonInfo(PersonInfo info) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("user_details");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(info);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}

	@Override
	public void deletePersonInfo(int id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("user_details");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		PersonInfo info = manager.find(PersonInfo.class, id);
		if(info != null) {
			manager.remove(info);
			manager.getTransaction().commit();

		}
		else {
			throw new UserDetailsHibernateException("id does not exists");
		}
		manager.close();
		factory.close();
	}

	@Override
	public PersonInfo getPersonInfo(int id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("user_details");
		EntityManager manager = factory.createEntityManager();
		PersonInfo info = manager.find(PersonInfo.class, id);
		if(info != null) {
			manager.close();
			factory.close();
			return info;
		}
		else {
			manager.close();
			factory.close();
			throw new UserDetailsHibernateException("id does not exists");
		}

	}

	@Override
	public List<PersonInfo> getAllPersonInfo() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("user_details");
		EntityManager manager = factory.createEntityManager();
		Query query =  manager.createQuery("select p from PersonInfo p");
		List<PersonInfo> list = query.getResultList();
		if(list.isEmpty()) {
			manager.close();
			factory.close();
			throw new UserDetailsHibernateException("id does not exists");
		}
		else {
			manager.close();
			factory.close();
			return list;
		}

	}

	@Override
	public void updatePersonName(int id, String name) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("user_details");
		EntityManager manager = factory.createEntityManager();

		PersonInfo info = manager.find(PersonInfo.class, id);
		if(info == null) {
			manager.close();
			factory.close();
			throw new UserDetailsHibernateException("id does not exists");

		}
		else {
			info.setName(name);
			manager.getTransaction().begin();
			manager.persist(info);
			manager.getTransaction().commit();
			System.out.println("updated");
			manager.close();
			factory.close();

		}

	}

	@Override
	public void updatePersonEmail(int id, String email) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("user_details");
		EntityManager manager = factory.createEntityManager();
		PersonInfo info = manager.find(PersonInfo.class, id);
		if(info == null) {
			manager.close();
			factory.close();
			throw new UserDetailsHibernateException("id does not exists");
		}
		else {
			info.setEmail(email);
			manager.getTransaction().begin();
			manager.persist(info);
			manager.getTransaction().commit();
			System.out.println("updated");
			manager.close();
			factory.close();
			
		}
	}

	@Override
	public void updatePersonPhone(int id, long phone) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("user_details");
		EntityManager manager = factory.createEntityManager();
		PersonInfo info = manager.find(PersonInfo.class, id);
		if(info == null) {
			manager.close();
			factory.close();
			throw new UserDetailsHibernateException("id does not exists");

		}
		else {
			info.setPhone(phone);
			manager.getTransaction().begin();
			manager.persist(info);
			manager.getTransaction().commit();
			System.out.println("updated");
			manager.close();
			factory.close();
					}
	}

	@Override
	public void updatePersonDob(int id, Date dob) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("user_details");
		EntityManager manager = factory.createEntityManager();
		PersonInfo info = manager.find(PersonInfo.class, id);
		if(info == null) {
			manager.close();
			factory.close();
			throw new UserDetailsHibernateException("id does not exists");
		}
		else {
			info.setDob(dob);
			manager.getTransaction().begin();
			manager.persist(info);
			manager.getTransaction().commit();
			System.out.println("updated");
			manager.close();
			factory.close();
			
		}
	}


}
