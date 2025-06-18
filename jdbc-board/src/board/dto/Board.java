package board.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 게시글 정보
 * board 테이블과 일치시켜주는 것이 좋음
 *                DB            Java
 * - 게시글 번호    no            no
 * - 제목          title         title
 * - 작성자        writer        writer
 * - 내용          content       content
 * - 등록일자       reg_date      regDate
 * - 수정일자       upd_date      updDate
 * 
 * DB에서 잘 가져오면 DTO 객체에 잘 매핑해서 담을 예정(DB에 넣을 때도 마찬가지)
 * 컬렉션에 담으면 게시글 목록이 됨
 */
@Data
@AllArgsConstructor
public class Board {
	private int no;
	private String title;
	private String writer;
	private String content;
	private LocalDateTime regDate;
	private LocalDateTime updDate;
	
	public Board() {
		this("(제목없음)", "(작성자없음)", "");
	}

	public Board(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
	}

//	public Board(int no, String title, String writer, String content, LocalDateTime regDate, LocalDateTime updDate) {
//		this.no = no;
//		this.title = title;
//		this.writer = writer;
//		this.content = content;
//		this.regDate = regDate;
//		this.updDate = updDate;
//	}

//	public int getNo() {
//		return no;
//	}
//
//	public void setNo(int no) {
//		this.no = no;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public String getWriter() {
//		return writer;
//	}
//
//	public void setWriter(String writer) {
//		this.writer = writer;
//	}
//
//	public String getContent() {
//		return content;
//	}
//
//	public void setContent(String content) {
//		this.content = content;
//	}
//
//	public LocalDateTime getRegDate() {
//		return regDate;
//	}
//
//	public void setRegDate(LocalDateTime regDate) {
//		this.regDate = regDate;
//	}
//
//	public LocalDateTime getUpdDate() {
//		return updDate;
//	}
//
//	public void setUpdDate(LocalDateTime updDate) {
//		this.updDate = updDate;
//	}
//
//	@Override
//	public String toString() {
//		return "Board [no=" + no + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regDate="
//				+ regDate + ", updDate=" + updDate + "]";
//	}
}
