package board.dao;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import board.dto.Board;

/**
 * 데이터 접근 객체
 * 데이터베이스에 접근하는 로직들을 작성
 * 여기서는 게시글 데이터에 접근
 */
public class BoardDAO extends JDBConnection {
	// JDBConnection을 상속받으면 BoardDAO 객체를 생성할 때
	// 부모인 JDBConnection 객체도 생성되면서 DB에 연결됨!
	
	/**
	 * 게시글 목록
	 * @return
	 */
	public List<Board> list() {
		// 게시글 목록을 담을 컬렉션 객체 생성
		List<Board> boardList = new ArrayList<Board>();
		
		// SQL 작성
		String sql = "SELECT * FROM board";
		
		try {
			// 1. SQL 쿼리 실행 객체 생성 - Statement(stmt)
			stmt = conn.createStatement();
			
			// 2. SQL 실행 요청 -> 반환되는 결과 ResultSet(rs)
			rs = stmt.executeQuery(sql);
			
			// 3. 조회된 결과를 리스트(boardList)에 추가
			while (rs.next()) { // 조회된 결과의 다음 행으로 이동
				Board board = new Board();
				
				// 결과 데이터 가져오기
				// rs.getXXX("컬럼명"): 해당 컬럼의 데이터를 반환
				board.setNo(rs.getInt("no"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getObject("reg_date", LocalDateTime.class));
//				board.setRegDate(rs.getTimestamp("reg_date").toLocalDateTime());
				board.setUpdDate(rs.getObject("upd_date", LocalDateTime.class));
				
				// 게시글 목록 추가
				boardList.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 4. 게시글 목록 반환
		return boardList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
