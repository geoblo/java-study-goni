package homework.homework01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookController {
	// ArrayList 객체(bookList) 생성
	private List<Book> bookList = new ArrayList<Book>();
	
    public BookController() {
        // 초기값 4개 추가
	    // "느리게 나이드는 습관", "정희원", "인문", 16200
        // "코스모스", "칼 세이건", "자연과학", 17910
        // "나에게 들려주는 예쁜 말", "김종원", "어린이", 15610
        // "혼자 공부하는 자바", "신용권", "기타", 25240
    	bookList.add(new Book("느리게 나이드는 습관", "정희원", "인문", 16200));
        bookList.add(new Book("코스모스", "칼 세이건", "자연과학", 17910));
        bookList.add(new Book("나에게 들려주는 예쁜 말", "김종원", "어린이", 15610));
        bookList.add(new Book("혼자 공부하는 자바", "신용권", "기타", 25240));
    }

    public void insertBook(Book bk) {
        // 전달 받은 bk를 bookList에 추가
    	bookList.add(bk);
    }

    public List<Book> selectList(){
        // bookList 반환
    	return bookList;
    }

    public List<Book> searchBook(String keyword){
        // 1. 검색 결과 리스트를 담아줄 리스트(ArrayList searchList) 선언 및 생성
    	List<Book> searchList = new ArrayList<Book>();
    	
        // 2. 반복문을 통해 list의 책 이름 중에 전달받은 keyword 포함된 경우
        // -> String에 특정 문자열이 포함되었는지 확인할 때
        // String데이터.contains("특정 문자열")
    	for (Book book : bookList) {
			if (book.getTitle().contains(keyword)) {
				// 3. searchList에 해당 책 추가
				searchList.add(book);
			}
		}
    	
        // 4. searchList 반환
    	return searchList;
    }

    public Book deleteBook(String title, String author){
        // 1. 삭제된 도서를 담을 객체(Book removeBook) 선언 및 null 할당
    	Book removeBook = null;
        
    	// 2. 반복문을 통해 bookList의 책 중 책 명이 전달 받은 title과 동일하고
        // 저자 명이 전달 받은 author와 동일한 경우 해당 인덱스 도서 삭제 후 빠져나감
    	for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getTitle().equals(title) && 
				bookList.get(i).getAuthor().equals(author)) {
				// 3. 삭제할 도서가 있는 경우 해당 도서를 removeBook에 대입
				removeBook = bookList.get(i);
				bookList.remove(i);
				break;
			}
		}
    	
        // 4. removeBook 객체 반환
    	return removeBook;
    }

    public int ascBook() {
	    // Collections.sort와 Comparable 활용
	    // 책 이름 기준으로 오름차순 정렬 후 1 반환
    	try {
    		Collections.sort(bookList);
    		return 1;
		} catch (Exception e) {
			return -1;
		}
    }
}
