package org.service.idea;

import java.util.List;

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
	
	
	public void createAdmin(String userName,String password){
		Admin admin=new Admin();
		admin.setUserName(userName);
		admin.setPassword(password);
		entityManager.persist(admin);
	
	}
	public Admin adminLogin(String userName,String password){
		Query query=entityManager.createQuery("SELECT a FROM Admin a WHERE a.userName=:userName AND a.password=:password");
		query.setParameter("userName",userName);
		query.setParameter("password",password);
		Admin admin=(Admin)query.getSingleResult();
		
		return admin;
	}
	public Admin checkExistAdmin(String userName){
		Query query=entityManager.createQuery("SELECT a FROM Admin a WHERE a.userName=:userName");
		query.setParameter("userName",userName);
		Admin admin=(Admin)query.getSingleResult();
		
		return admin;
	}
	public List<Admin> listAdmins(){
		Query query=entityManager.createQuery("SELECT a FROM Admin a");
		
		@SuppressWarnings("unchecked")
		List<Admin> admin=query.getResultList();
		
		return admin;
	}

}
