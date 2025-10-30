package exam4;

import java.time.LocalDate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Test01_insert {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaEx01");
		EntityManager em = emf.createEntityManager();
		EntityTransaction ts = em.getTransaction();
		
		try {
			ts.begin();
			Member4 user;
			user = new Member4("test1@tjoeun.com", "김민수", LocalDate.now());
			em.persist(user);
			user = new Member4("test2@tjoeun.com", "이서연", LocalDate.now());
			em.persist(user);
			user = new Member4("test3@tjoeun.com", "박지훈", LocalDate.now());
			em.persist(user);
			user = new Member4("test4@tjoeun.com", "최유진", LocalDate.now());
			em.persist(user);
			user = new Member4("test5@tjoeun.com", "정현우", LocalDate.now());
			em.persist(user);
			user = new Member4("test6@tjoeun.com", "한지민", LocalDate.now());
			em.persist(user);
			user = new Member4("test7@tjoeun.com", "오세훈", LocalDate.now());
			em.persist(user);
			user = new Member4("test8@tjoeun.com", "윤아름", LocalDate.now());
			em.persist(user);
			user = new Member4("test9@tjoeun.com", "장민재", LocalDate.now());
			em.persist(user);

			ts.commit();
			System.out.println("가입 요청을 처리했습니다.");
			
		} catch(Exception e) {
			e.printStackTrace();
			ts.rollback();
		}
		em.close();
		emf.close();
	}
}
