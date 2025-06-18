package board.service;

import java.util.List;

import board.dto.Board;

/**
 * 게시판 프로그램의 기능 정의
 * - 게시글 목록
 * - 게시글 조회
 * - 게시글 등록
 * - 게시글 수정
 * - 게시글 삭제
 * 
 * => 인터페이스에 추상 메소드로 정의
 */
public interface BoardService {
	// 게시글 목록
	// 전체 게시글 목록을 List에 담음
	List<Board> list();
	
	
	
	
	
}
