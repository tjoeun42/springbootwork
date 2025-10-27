package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 * 로그 활용
   - 애플리케이션의 흐름을 모니터링 한다.
   - 프로그램 코드의 예기치 못한 오류를 포착하는데 도움이 된다.
   - 스프링부트 스타터 패키지에는 "별도의 구성없이" 로깅을 쓸 수 있는 로그백이 있다.
   
 * 로깅 수준 설정 : 8가지
   : 설정하면 해당 로깅 수준 +이상 수준까지 출력된다.
   - OFF : log 출력 off
   - FATAL : 애플리케이션 실행에 심각할 정도의 오류
   - ERROR : 애플리케이션 계속 실행가능하지만, 꽤 심각한 오류
   - WARN : 애플리케이션 잠재적인 위험을 안기는 오류
   - INFO : 애플리케이션 주요 실행 정보
   - DEBUG : 애플리케이션 내부 실행에 대한 정보
   - TRACE : 애플리케이션 실행 내역에 대한 degug보다 상세한 정보
   - ALL : 모든 로깅 정보  
 */
@SpringBootApplication
public class Ex03LoggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ex03LoggerApplication.class, args);
	}

}
