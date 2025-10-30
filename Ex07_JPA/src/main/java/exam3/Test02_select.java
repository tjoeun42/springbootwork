package exam3;

import java.time.LocalDate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Test02_select {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaEx01");
		EntityManager em = emf.createEntityManager();

		/*
		 * 검색시 find()메소드 이용
		   - tjoeun를 찾아서 Member3에 담아서 가져옴
		     > 아무것도 지정하지 않으면 @Id가 붙은 primarykey를 이용하여 검색해서 가져옴
		 */
		Member3 user = em.find(Member3.class, "tjoeun");
		System.out.println(user);
		
		if(user != null) {
			System.out.println("이름 : " + user.getName());
			/*
			 * 't' or 'T' : 날짜, 시간(날짜 및 시간 서식문자 앞에 지정)
			      ex) %tY, %tm
			    'Y' : 년도(4자리)
			    'y' : 년도(2자리)
			    'm' : 월(01~12)
			    'd' : 일(01~31)
			    'e' : 일(1~31)
			    'H' : 24시간 형식의 시(00~23)
			    'I' : 12시간 형식의 시(01~12)
			    'M' : 분(00~59)
			    'S' : 초(00~59)
			    
			    %< 로 상대 인덱스 지정하여 직전의 인수와 같은 인덱스를 이용
			 */
			System.out.printf("생성일 : %ty/%<tm/%<td", user.getCreateDate());
		} else {
			System.out.println("Id가 존재하지 않습니다");
		}
	
		em.close();
		emf.close();
	}

}
