package exam3;

import java.time.LocalDate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Test03_update {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaEx01");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			Member3 user = em.find(Member3.class, "tjoeun");
			
			if(user == null) {
				System.out.println("id를 찾을 수 없습니다");
				return;
			}
			user.changeName("한나은");  // setter 메소드를 만들어 사용해도 됨
		
			em.getTransaction().commit();
			
		} catch(Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		em.close();
		emf.close();
	}

}
