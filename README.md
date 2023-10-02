# IT 대기업 현업 개발자와 함께 하는 백엔드 개발 실무

## comento-backend 프로젝트 

* Spring, Spring Boot 프레임워크 사용하여 SW활용 현황 통계 API 개발

***

# 1주차 진행 내용 (폴더 settingweb)
1. 개발 환경 셋팅 
   * Java
     + JDK1.8
   * Framework
     + Spring 5.3.20
     + Spring을 사용하면서 무수한 xml파일 작성, WAS(Tomcat)설정, 라이브러리 의존성 관리 등 번거로움을 느낌 ->  Spring Boot를 선호하는 이유
   * WAS
     + Tomcat 9.0.80
   * IDE
     + Eclipse(2019-6)
   * DB
     + mysql, mysql workbench 8.0.34

***
    
# 2주차 진행 내용 (폴더 settingapi)
1. 프론트엔드 개발자와 백엔드 개발자의 협업 이해하기
    * REST, REST API, RESTful개념 알기

    * JSON포맷으로 데이터 응답 알기

***
    
# 3주차 진행 내용 (폴더 settingweb_boot)

1. 본 과정에서는 RestController를 사용한 간단한 API ( 20년도의 로그인 수) 를 구현
2. [sql 작성하기](https://github.com/0sik/comento/tree/week5/settingweb_boot)
```
<!-- 0) 년도 접속자 수 -->
<!-- 1) 월별 접속자 수 -->
<!-- 2) 일자별 접속자 수 -->
<!-- 3) 평균 하루 로그인 수 -->
<!-- 4) 휴일을 제외한 로그인 수 (휴일을 포함하는 경우) -->
<!-- 5) 부서별 월별 로그인 수 -->
```


***
    
# 4주차 진행 내용
내용 정리하기 

- [RESTful,HTTPS, TCP, UDP](https://0sik.github.io/backendstudy/backendstudy-Restful,Https,Tcp,Udp/)

- [Filter, Interceptor, AOP](https://0sik.github.io/backendstudy/backendstudy-Filter,-Interceptor,-AOP/)


***

# 5주차 진행 내용
1. Spring 개발 환경 설정
  * DI(@Inject,@Autowired),IOC,DAO,VO,DTO(Response) ,,, Entity
    - DI란 의존성 주입이다.  순수 자바로 이용하는 new키워드를 사용하지 않고 Inject, Autowired나 롬복의 @RequiredArgsConstructor 를 이용하여 생성자를 주입 하여 개발에 바로 사용.
    - IOC컨테이너 안에 올라와 있는 객체를 DI의 개념으로 바로 쓸수있어 spring의 생산성이 올라간다.
    - DAO는 데이터에 접근하기 위한 오브젝트인데 마이바티스를 붙여 쿼리를 실행할수있는 영역
    - VO란 클래스인데 데이터를 담는 역할을 하는 클래스
    - DTO 클래스인데 response나 request의 데이터를 주고받는 영역의 클래스이다. 
    - JPA를 사용하게 된다면 그 안의 데이터베이스를 객체 단위로 사용하게 하는 orm을 사용하게 된다면 entity도 알아야한다.

2. BackEnd기본(@RestController(@responseBody, @Controller 를 활용한 데이터 처리))
  * try - catch말고도 ControllerAdvice를 통한 유효성 검사를 진행할수 있다. 

3. 크로스 브라우징, 크로스 도메인 
  * 크로스 부라우징 이슈 란 : 각각의 브라우저마다 다른 것을 요구할때가 있다 이 브라우저가 사파리인지 엣지인지 크롬인지 이벤트를 받을때 if else나 라이브러리나 직적 구현시에는 기능 탐지를 이용한다. 
  * 크로스 도메인 이란 : 도메인이 다른 곳에서 요청이 들어왔을때 어떻게 하지? 이 문제는 cors문제다. 백엔드 개발자 들이 이것을 열어 줄 수가 있다 . config 파일 안에 어떤 도메인의 요청을 허용한다고 설정할수있다. 또는 server to server통신으로 해결할수 있다. (httpclient,restTemplate)

4. sql
  * map 리턴 : vo , dto 를 사용하지 않고 map으로 리턴하는 방법 (가독성 떨어짐, 생산속도 높음)
  
