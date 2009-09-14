package com.efi.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.log4j.Logger;


public class LoginService {
	private static Logger log = Logger.getLogger(LoginService.class);
	private static final String PERSISTENCE_UNIT = "printsmith_db";

	public LoginService() {

		super();

	}

	public Boolean validateLogin(String userName, String password) {
		try {		
			log.info("Attempting login for " + userName);
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
			EntityManager em = entityManagerFactory.createEntityManager();
			Query q = em.createNamedQuery("users.byName");
			q.setParameter("name", userName);
			
			List<User> users = q.getResultList();
			
			if (users.size() != 1)
				return false;
			
			if (users.get(0).getPassword().equals(password)) return true;
		} catch (Exception e) {
			log.error(e);
		}
		return false;		
	}
}