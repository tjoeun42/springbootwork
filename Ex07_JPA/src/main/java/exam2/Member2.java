package exam2;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="JpaMember2")
public class Member2 {
	@Id   // 테이블의 pk
	@SequenceGenerator (
		name = "mySequence2",
		sequenceName = "JpaMember2_SEQ", 
		initialValue = 1,
		allocationSize = 1				// 1씩 증가
	)
	@GeneratedValue(generator="mySequence2")
	private Long id;
	
	@Access(AccessType.FIELD)		// 기본값 : 멤버 변수를 통해서 데이터 접근
	private String username;
	
	@Access(AccessType.PROPERTY)		// 프로퍼티(getter/setter메소드)를 통해서 데이터 접근
	private String password;
	
	@Transient						// 방법1 어노테이션으로 제외함. 이 필드는 DB에 없는 필드이므로 제외 함
	private Long timestamp1;
	transient private Long timestamp2;	// 방법2 지시자를 이용하여 제외함. 이 필드는 DB에 없는 필드이므로 제외 함
	
	public Member2() { }
	
	public Member2(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
