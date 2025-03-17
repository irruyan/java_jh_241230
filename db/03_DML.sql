# INSERT : 데이터 추가
# SELECT : 데이터 조회
# UPDATE : 데이터 수정
# DELETE : 데이터 삭제

# 데이터 추가
# INSERT INTO 테이블명 VALUE(값1, ..., 값N) 
#   - 값들 순서는 속성 순서에 맞게 넣어 주어야 함.  
#   - 테이블명 대신 DB명.테이블명으로 해도 됨
#   - DB명.테이블명으로 쓰면 선택된 DB와 상관없이 실행.
#   - 테이블명만 쓰면 선택된 DB에 따라 동작되지 않을 수 있음. 
USE STUDENT;
INSERT INTO STUDENT VALUE(1, 1, 1, 1, "홍길동");

# INSERT INTO 테이블명(속성1, ..., 속성N) VALUE(값1, ..., 값N)
#   - 일부 속성 값을 생략할 때 사용
#   - 생략할 수 있는 속성들
#     1. NULL 허용인 속성들 
#     2. NOT NULL이지만 DEFAULT를 이용하여 기본값을 지정한 속성들 
INSERT INTO STUDENT(ST_GRADE, ST_CLASS, ST_NUM, ST_NAME) VALUE(1, 1, 2, "임꺽정");
INSERT INTO STUDENT(ST_NUM, ST_NAME) VALUE(3, "고길동");

# INSERT INTO 테이블명(속성1, ..., 속성N) VALUES(값1, ..., 값N), (값1, ..., 값N), ...; 
INSERT INTO STUDENT(ST_NUM, ST_NAME) VALUES(4, "둘리"), (5, "하니");

# INSERT INTO 테이블명(속성1, ..., 속성N) SELECT 값1, 값2, ..., 속성A FROM 테이블명 WHERE 조건
#   - 테이블에서 검색된 값을 이용하여 추가할 때 사용 
#   - 여기서 값1, 값2.. 들은 지정된 값이고, 속성A는 검색 결과 값 


# 데이터 수정
# UPDATE 테이블명 SET 속성1 = 값1, ..., 속성N = 값N WHERE 조건 
# 조건에서 같다는 =, 같지 않다는 != 또는 <> 
# NULL과 같다는 IS NULL, NULL과 같지 않다는 IS NOT NULL 
# 1학년 1반 1번 학생의 이름을 홍길동A로 수정하는 쿼리 
UPDATE STUDENT 
SET 
    ST_NAME = '홍길동A'
WHERE
    ST_GRADE = 1 AND ST_CLASS = 1 AND ST_NUM = 1;
    
# 데이터 삭제
# DELETE FROM 테이블명 WHERE 조건;
# 1학년 1반 2번 학생의 데이터를 삭제하는 쿼리
DELETE FROM STUDENT 
WHERE
    ST_GRADE = 1 AND ST_CLASS = 1 AND ST_NUM = 2;
    
    INSERT INTO STUDENT(ST_GRADE, ST_CLASS, ST_NUM, ST_NAME) VALUES
    (2, 1, 1, "김길동"), (2, 1, 2, "가길동"), (2, 1, 3, "나길동"), 
    (2, 2, 1, "이길동"), (2, 2, 2, "박길동"), (2, 2, 3, "최길동"),
    (2, 3, 1, "정길동"), (2, 3, 1, "하길동"), (2, 3, 1, "오길동"), 
    (3, 1, 1, "강길동"), (3, 1, 2, "변길동"), (3, 1, 3, "전길동"), 
    (3, 2, 1, "강길동"), (3, 2, 2, "변길동"), (3, 2, 3, "전길동"), 
    (3, 3, 1, "강길동"), (3, 3, 2, "변길동"), (3, 3, 3, "전길동");
    
    SELECT * FROM STUDENT ORDER BY ST_GRADE, ST_CLASS, ST_NUM ;
    
    SELECT * FROM STUDENT WHERE ST_GRADE = 3 ORDER BY ST_NAME, ST_CLASS, ST_NUM;
    
    #과목 샘플 데이터 추가
    INSERT INTO STUDENT.SUBJECT(SJ_GRADE, SJ_SEMESTER, SJ_NAME) VALUES
    (1, 1, "국어"), (1, 1, "영어"), (1, 1, "수학"),
    (1, 2, "국어"), (1, 2, "영어"), (1, 2, "수학"),
    (2, 1, "국어"), (2, 1, "영어"), (2, 1, "수학"),
    (2, 2, "국어"), (2, 2, "영어"), (2, 2, "수학"),
    (3, 1, "국어"), (3, 1, "영어"), (3, 1, "수학"),
    (3, 2, "국어"), (3, 2, "영어"), (3, 2, "수학");
    
    #성적 샘플 데이터 추가
    INSERT INTO STUDENT.SCORE(SC_ST_KEY, SC_SJ_NUM, SC_SCORE) VALUES
    (1, 1, 100), (1, 2, 100), (1, 3, 100),
    (3, 1, 90), (3, 2, 80), (3, 3, 70),
    (4, 1, 90), (4, 2, 10), (4, 3, 100),
    (5, 1, 90), (5, 2, 100), (5, 3, 10),
    (6, 4, 100), (6, 5, 100), (6, 6, 100),
    (7, 4, 90), (7, 5, 70), (7, 6, 50),
    (8, 4, 80), (8, 5, 80), (8, 6, 30),
    (9, 4, 90), (9, 5, 60), (9, 6, 40),
    (10, 4, 60), (10, 5, 88), (10, 6, 10),
    (11, 4, 20), (11, 5, 96), (11, 6, 80),
    (12, 4, 30), (12, 5, 42), (12, 6, 60),
    (13, 4, 55), (13, 5, 28), (13, 6, 40),
    (14, 4, 10), (14, 5, 80), (14, 6, 70),
    (15, 7, 40), (14, 8, 60), (14, 9, 100);
    
    
# 1학년 1반 1번의 1학년 2학기 국어 성적을 100점으로 추가
SELECT ST_KEY FROM STUDENT WHERE ST_GRADE = 1 AND ST_CLASS = 1 AND ST_NUM = 1;
SELECT SJ_NUM FROM SUBJECT WHERE SJ_GRADE = 1 AND SJ_SEMESTER = 2 AND SJ_NAME = "국어";

SELECT ST_KEY, SJ_NUM
FROM STUDENT 
JOIN SUBJECT
WHERE 
	ST_GRADE = 1 AND ST_CLASS = 1 AND ST_NUM = 1
    AND SJ_GRADE = 1 AND SJ_SEMESTER = 2 AND SJ_NAME = "국어";
    
SELECT ST_KEY, SJ_NUM
FROM (SELECT ST_KEY FROM STUDENT WHERE ST_GRADE = 1 AND ST_CLASS = 1 AND ST_NUM = 1) AS T1
JOIN (SELECT SJ_NUM FROM SUBJECT WHERE SJ_GRADE = 1 AND SJ_SEMESTER = 2 AND SJ_NAME = "국어") AS T2;

INSERT INTO SCORE(SC_ST_KEY, SC_SJ_NUM, SC_SCORE)
SELECT ST_KEY, SJ_NUM, 100
FROM (SELECT ST_KEY FROM STUDENT WHERE ST_GRADE = 1 AND ST_CLASS = 1 AND ST_NUM = 1) AS T1
JOIN (SELECT SJ_NUM FROM SUBJECT WHERE SJ_GRADE = 1 AND SJ_SEMESTER = 2 AND SJ_NAME = "국어") AS T2;
    
    