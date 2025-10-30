package exam4;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Test02_TypedQuery {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaEx01");
		EntityManager em = emf.createEntityManager();
		
		/*
		 * TypedQuery클래스 : sql문을 직접 작성하고자 할 때(나에게 맞는 select문을 사용하고자 할 때)
		   - 일반 sql문이 아니고 영속성의 객체에 넣을 구문 jpa문법임
		     select * => *를 사용할 수 없음. 테이블의 별칭을 넣어줘야 함
		 */
		
		TypedQuery<Member4> query = em.createQuery(
				"select m from Member4 m order by m.name",
				Member4.class
				);
		List<Member4> list = query.getResultList();
		
		if(list.isEmpty()) {
			System.out.println("DB에 회원이 없습니다.");
		} else {
			list.forEach(user -> 
				System.out.println("| " + user.getEmail() + " | " + user.getName() + " | " + user.getCreateDate()));
		}
		em.close();
		emf.close();
	}
}
