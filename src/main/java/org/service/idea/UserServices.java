package org.service.idea;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;
import org.springframework.transaction.annotation.Transactional;
import org.model.idea.User;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServices {
	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	private EntityManager entityManager;
	
	
	public User createUser(User user){
		entityManager.persist(user);
		return user;
	}
	public User login(String email,String password){
		Query query=entityManager.createQuery("SELECT u FROM User u WHERE u.email=:emailparam AND u.password=:passwordparam");
		query.setParameter("emailparam", email);
	    query.setParameter("passwordparam", password);
	    User user=(User) query.getSingleResult();
		return user;
		
	}
	
	
	
	
}
