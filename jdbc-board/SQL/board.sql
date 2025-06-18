-- 게시판 프로젝트 데이터베이스 생성
CREATE DATABASE jdbc_board;
USE jdbc_board;

-- 게시판 테이블 생성
CREATE TABLE board (
	no INTEGER AUTO_INCREMENT,
    title VARCHAR(100) NOT NULL,
    writer VARCHAR(100) NOT NULL,
    content TEXT,
    reg_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    -- DATE 타입: reg_date DATE NOT NULL DEFAULT CURRENT_DATE
    upd_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    -- ON UPDATE CURRENT_TIMESTAMP: UPDATE 시 자동으로 수정 시간도 갱신
    PRIMARY KEY (no)
);

DESC board;

-- 추가
INSERT INTO board (title, writer, content)
VALUES 
	('게시글 제목1', '김재', '집에 가고 싶다.'),
    ('게시글 제목2', '현', '집에 안가');

-- 조회
SELECT * FROM board; -- 전체 게시글 목록 조회
SELECT * FROM board WHERE no = 1; -- 특정 게시글 조회

-- 수정
UPDATE board
SET
	title = '게시글 제목 수정',
    writer = '재현',
    content = '나 먼저감'
    -- upd_date = now() -- 수정일을 현재 시간으로 갱신
WHERE no = 1;

-- 삭제
DELETE FROM board
WHERE no = 1;


