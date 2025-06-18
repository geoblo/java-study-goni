package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBConnection {
	// JDBC를 사용할 때 기본 구성
	// 1. JDBC 드라이버: 
	// 자바와 특정 데이터베이스(DBMS)가 서로 통신할 수 있게 해줌
	// DB 회사가 자사의 DB를 접근/제어 할 수 있는 기능을 만들어서 제공하는 자바 라이브러리
	// DBMS마다 다름: MySQL, Oracle 등
	// JDBC 인터페이스를 구현했기 때문에 다른 DB 사용 시 드라이버만 교체하면 됨!
	
	// 2. Connection: 
	// 자바와 데이터베이스 사이의 실제 연결 통로
	// DB에 접속할 수 있게 해줌
	// SQL 문장을 보낼 수 있는 Statement나 PreparedStatement를 만들어 줌
	
	// 3. Statement / PreparedStatement: 자바에서 SQL을 보내는 수단
	// Statement: 정적(고정된) SQL 쿼리를 직접 문자열로 작성해서 실행
	// PreparedStatement: ?(물음표) 파라미터로 값을 나중에 바인딩해서 실행하는 보안/성능 개선된 Statement
	// SQL 문장을 데이터베이스로 보냄(SELECT, INSERT, UPDATE, DELETE 등)
    // 실행 후 ResultSet 또는 영향 받은 행 수를 반환
	
	// 4. ResultSet: 
	// DB에서 받은 SELECT 쿼리의 결과를 담는 객체
	// 결과는 테이블 구조처럼 행(row)과 열(column)로 구성되어 있고, 커서를 통해 순차적으로 접근
	// rs.next() 메서드를 호출하면 다음 행으로 이동하며,
	// 다양한 타입으로 값을 꺼낼 수 있음(getString(), getInt() 등)
	
	public Connection conn;
	public Statement stmt;
	public PreparedStatement psmt;
	public ResultSet rs;
	
	// 기본 생성자
	public JDBConnection() {
		// JDBC 드라이버 로드
		// mysql-connector-j.xxx.jar 드라이버의 클래스를 로드
		
		
		// DB에 연결
		// - 연결에 필요한 정보: URL, id, pw
		// URL: jdbc:mysql://도메인:[PORT]/[스키마]?옵션파라미터
		//      * jdbc:mysql = 프로토콜
		//		* 내 PC의 IP주소: localhost = 127.0.0.1
		//		* 3306: MySQL 데이터베이스의 기본 포트
		
		
		// DriverManager: 자바 프로그램을 JDBC 드라이버에 연결시켜주는 클래스
		// 자바 프로그램이 적절한 JDBC 드라이버를 통해 DB에 접속할 수 있도록 연결을 중개
		// (자바 프로그램 -> JDBC 드라이버 -> DB)
		// getConnection() 메소드로 DB에 연결 요청하고 생성된 Connection 객체를 반환
		
		
	}
	
	
	public static void main(String[] args) {

	}

}
