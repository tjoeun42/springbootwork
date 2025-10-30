package exam4;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Test04_ParamLike {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaEx01");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Member4> query = em.createQuery(
													"select m from Member4 m where m.name like :name order by m.name",
													Member4.class
													)
									  .setParameter("name", "%민%");
		
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
