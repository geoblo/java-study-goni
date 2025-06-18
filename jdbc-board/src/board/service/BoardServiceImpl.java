package board.service;

import java.util.List;

import board.dao.BoardDAO;
import board.dto.Board;

/**
 * 게시판 기능 구현
 * 실제 비즈니스 로직(핵심 로직)을 작성
 */
public class BoardServiceImpl implements BoardService {
	
	private BoardDAO boardDAO = new BoardDAO();
	
	@Override
	public List<Board> list() {
		// DAO(데이터베이스에 접근하는 객체)로 게시글 목록을 요청하고 List<Board>로 받아옴
		List<Board> boardList = boardDAO.list(); // 게시글 목록을 가져옴
		
		return boardList;
	}

}
