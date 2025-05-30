package sec01.exam02;

import java.util.List;
import java.util.Vector;

// Vector는 거의 사용되지 않음(유지보수성 및 성능 관점에서)
// 특히 웹 개발에서는 ArrayList, HashMap을 많이 사용
public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		list.remove(2);
		list.remove(3);
		
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getSubject() + '\t' + board.getContent() + "\t" + board.getWriter());
		}
	}

}
