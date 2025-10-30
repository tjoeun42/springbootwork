package exam3;

import java.time.LocalDate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Test04_delete {

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
			em.remove(user);  // 영속성의 객체를 삭제
		
			em.getTransaction().commit();
			System.out.println("탈퇴처리 되었습니다");
			
		} catch(Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		em.close();
		emf.close();
	}

}
