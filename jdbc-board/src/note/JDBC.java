// JDBC + MySQL을 이용한 콘솔 기반 게시판 프로젝트를 만들기

// 0. JDBC(Java Database Connectivity)란?
// 자바 프로그램이 데이터베이스와 통신할 수 있도록 도와주는 연결 도구(API)
//             (인터페이스)
// 자바 프로그램  -  JDBC  -  Oracle
//                      -  MySQL
//                      -  MS SQL Server


// 1. MySQL 데이터베이스/테이블 생성
// 데이터베이스 명: jdbc_board
// 테이블 명: board
// => board.sql 작성


// 2. Java 프로젝트 생성
// 1) File → New → Java Project
// 2) 프로젝트 이름: `jdbc-board`
// 3) JDK: 21 선택 (자바 21 설치돼 있어야 함)
// 4) `module-info.java` 생성 여부: 체크 해제
// 5) 프로젝트 생성 후 `src` 폴더 아래에 `board` 패키지 아래에 `JDBConnection.java` 생성


// 3. MySQL 라이브러리 추가하기(MySQL 커넥터 JAR 등록)
// 자바 개발 환경이 세팅이 되어 있는 상태에서 MySQL 드라이버를 다운로드 받아서 
// 우리가 개발할 자바 프로젝트에 MySQL 라이브러리를 추가시켜 주면
// MySQL 데이터베이스와 연동을 시킨 자바 프로젝트를 구성할 수가 있음

// 프로젝트에 추가하는 작업을 해보자!
// https://dev.mysql.com/downloads/

// 커넥터 자바: Connector/J 
// -> Connector/J 9.3.0 
// -> Platform Independent (Architecture Independent), ZIP Archive 다운로드
// 압축 풀기

// `lib/` 폴더 만들어 JAR 파일을 넣고 
// Eclipse에서 프로젝트 우클릭 → Build Path → Configure Build Path...
// Libraries 탭 -> Classpath 선택 -> `Add JARs...` 사용
// JAR 파일 선택 -> `Apply and Close`

// (참고)
// 왜 Classpath를 선택해야 하나요?
//                                 Classpath  Modulepath
// 모듈 시스템 사용(module-info.java)	❌ 없음	  ✅ 있음


// 4. DB 연결 테스트(`JDBConnection.java`)
// 실행 시 `DB 연결 성공!` 메시지가 뜨면 연결 완료입니다.


// 5. 프로젝트 구조
// jdbc-board
// ├── dao/
// │   └── BoardDAO.java
// │   └── JDBConnection.java
// ├── dto/
// │   └── Board.java
// ├── service/
// │   └── BoardService.java
// │   └── BoardServiceImpl.java
// └── Main.java

// 1) 데이터 계층 (Data Access Layer): 데이터베이스와 상호작용하는 계층
// - DTO(Data Transfer Object) 또는 VO: 데이터 전송 객체
// 서로 다른 클래스 간에, 서로 다른 계층 사이에서 데이터를 전달하기 위해 사용
// DB의 테이블 구조와 대응되는 순수한 데이터 객체
// 주로, 데이터베이스로부터 읽어온 데이터 단위를 객체로 가져와서 사용
// DB(레코드) ---> 자바(객체)

// - DAO(Data Access Object): 데이터 접근 객체
// 데이터베이스에 접근을 하여 상호작용을 하는 객체
// 데이터베이스에 직접 접근해서 CRUD를 수행
// 업무 로직과 데이터베이스 연동 로직을 분리하기 위해서 사용

// 2) 비즈니스 로직 계층(Business Logic Layer)
// - Service: 비즈니스 로직(핵심 로직)을 처리하는 계층
// 데이터 처리 로직
// 업무 프로세스(비즈니스 규칙) 로직
// 주로 DAO를 호출해서 로직을 조합하거나 조건을 처리 

// 3) 프레젠테이션 계층(Presentation Layer)
// - Main(또는 Controller): 사용자와 직접 상호작용하는 계층(UI 역할)
// 사용자의 입력을 받고, Service 계층을 호출해서 결과를 출력하는 콘솔 기반 인터페이스
// 입력/출력을 담당하고 전체적인 흐름을 제어


// 6. 게시판 기능 구현
// 일반적으로는 DTO -> DAO -> Service -> Main(또는 Controller) 순으로 
// 구현하는 것이 가장 자연스럽고 유지보수에도 유리

// 1) DTO(Board.java) - 게시글 정보를 담을 객체, lombok 설치 및 적용까지
// 2) DAO(BoardDAO.java) - 데이터베이스에 접근하는 로직들을 작성
// 3) Service(BoardService.java) - 구현할 기능들 정의
// 4) Service(BoardServiceImpl.java) - 실제 기능 구현(비즈니스 로직)
// 5) Main.java - 콘솔 기반 메뉴와 입출력 구현
// 실행 흐름 예: 
// 1. 게시글 목록 메뉴 선택 시
// -> BoardService 인터페이스의 list() 메소드 호출
// -> BoardServiceImpl 구현 클래스의 실제로 구현된 list() 메소드가 호출
// -> BoardDAO에 있는 list() 메소드를 호출
// -> 실제 DB로 요청을 보냄
// -> 게시글 목록을 받아와서 List<Board>에 담아 다시 Main 까지 전달되도록 반환
// -> Main 에서 출력


