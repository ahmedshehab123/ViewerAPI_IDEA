package org.service.idea;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;
import org.springframework.transaction.annotation.Transactional;
import org.model.idea.Admin;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AdminServices {

	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	private EntityManager entityManager;
	
	
	public void createAdmin(Admin admin){
		entityManager.persist(admin);
	
	}
	public Admin adminLogin(String userName,String password){
		Query query=entityManager.createQuery("SELECT a FROM Admin a WHERE a.userName=:userName AND a.password=:password");
		query.setParameter("userName",userName);
		query.setParameter("password",password);
		Admin admin=(Admin)query.getSingleResult();
		
		return admin;
	}

}
