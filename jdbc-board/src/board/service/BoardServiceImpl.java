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

	@Override
	public Board select(int no) {
		// 게시글 번호(no)를 DB로 넘겨주고 게시글 정보 요청
		Board board = boardDAO.select(no);
		
		return board;
	}

	@Override
	public int insert(Board board) {
		// 게시글 정보를 전달하여 DB에 데이터 등록 요청
		int result = boardDAO.insert(board);
		// 적용된 데이터 개수를 반환
		// 0: 데이터 등록 실패
		// 1: 데이터 등록 성공
		
		if (result > 0) {
			System.out.println("데이터 등록 성공!");
		} else {
			System.out.println("데이터 등록 실패!");
		}
		
		return result;
	}

	@Override
	public int update(Board board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int no) {
		// TODO Auto-generated method stub
		return 0;
	}

}
