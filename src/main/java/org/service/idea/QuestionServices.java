package org.service.idea;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;
import org.model.idea.Questions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class QuestionServices {
	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	private EntityManager entityManager;
	public void createQuestion(Questions question){
		entityManager.persist(question);
		
	}
	public List<Questions> displayQuestions() {
		Query query=entityManager.createQuery("SELECT a FROM Questions a");
		 @SuppressWarnings("unchecked")
		List<Questions> rlist=query.getResultList();
        return rlist;
        
	}

}
