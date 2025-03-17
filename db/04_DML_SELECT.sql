
# SELECT * FROM 테이블명;
# 테이블에 있는 모든 속성들의 데이터를 조회하는 쿼리 

SELECT * FROM STUDENT;

# SELECT 속성1, ..., 속성N FROM 테이블명;
# 테이블에 있는 속성1, ..., 속성N의 데이터를 조회하는 쿼리 
# 학생들의 학년, 반, 번호, 이름을 조회하는 쿼리 
# 속성명 옆에 AS 새속성명을 입력하면 결과창에 속성 이름을 변경할 수 있음 
#   - AS 생략 가능 
SELECT ST_GRADE AS 학년, ST_CLASS AS "반", ST_NUM 번호, ST_NAME "이름" FROM STUDENT;

# SELECT [DISTINCT] 속성1, ..., 속성N FROM 테이블명 [WHERE 조건식]
# 조건식을 만족하는 속성들을 조회하는 쿼리. 
# 중복된 행은 제거 => 기본키 속성을 포함하지 않은 경우 중복이 가능 
# 논리 연산자
#   - AND, OR, NOT
#   - AND의 우선순위가 OR보다 높다 
# 비교 연산자
#   - =, !=, <>, <, <=, >= 
#   - 속성 BETWEEN A AND B : A이상 B이하 => 속성 >= A AND 속성 <= B
#   - 속성 NOT BETWEEN A AND B : A미만 또는 B 초과 => 속성 < A OR 속성 > B 
#   - 속성 IN(값1, ..., 값N) : 속성의 값이 값1, ..., 값N 중에 있을 때 참 => 속성 = 값1 OR ... OR 속성 = 값N
#   - 속성 NOT IN(값1, ..., 갑N) : 속성의 값이 값1, ..., 값N 중에 없을 때 참 => 속성 != 값1 AND ... AND 속성 != 값N
#   - LIKE "패턴" : 패턴과 일치하는 값을 조회할 때 사용
#     - _ : 한 글자 
#     - % : 0글자 이상 
#     - ___ : 3글자 
#     - 홍% : 홍으로 시작하는 문자열 
#   - NULL 확인
#     - IS NULL : NULL이면 참
#     - IS NOT NULL : NULL이 아니면 참

# 등록된 학생들의 학년을 조회하는 쿼리 
SELECT DISTINCT ST_GRADE 학년 FROM STUDENT;

# 1학년 학생들을 조회하는 쿼리
SELECT * FROM STUDENT WHERE ST_GRADE = 1;

# 1학년 1반의 번호가 1 ~ 3인 학생들을 조회하는 쿼리 
SELECT * FROM STUDENT WHERE ST_NUM BETWEEN 1 AND 3 AND ST_CLASS = 1 AND ST_GRADE = 1;
SELECT * FROM STUDENT WHERE ST_NUM IN(1,2,3) AND ST_CLASS = 1 AND ST_GRADE = 1;

# 성이 홍씨인 학생들을 조회하는 쿼리 
SELECT * FROM STUDENT WHERE ST_NAME LIKE "홍%";
SELECT * FROM STUDENT WHERE ST_NAME LIKE CONCAT("홍", "%");
# 이름에 길이 들어가는 학생들을 조회하는 쿼리 
SELECT * FROM STUDENT WHERE ST_NAME LIKE "%길%";
# 성이 홍씨이고 이름이 3글자인 학생들을 조회하는 쿼리 
SELECT * FROM STUDENT WHERE ST_NAME LIKE "홍__";
# 성이 홍씨가 아닌 학생들을 조회하는 쿼리 
SELECT * FROM STUDENT WHERE ST_NAME NOT LIKE "홍%";

SELECT * FROM STUDENT LIMIT 3;
SELECT * FROM STUDENT LIMIT 0, 3;
SELECT * FROM STUDENT LIMIT 8, 3;

SELECT * FROM STUDENT LIMIT 6, 3; # 6 => 3명 * (3페이지 - 1)

SELECT COUNT(*) AS "1학년 1반 학생 수" FROM STUDENT.STUDENT WHERE ST_GRADE=1 AND ST_CLASS=1;

#각 학년 각반의 학생수를 조회
SELECT ST_GRADE, ST_CLASS, COUNT(*) AS "학생 수" FROM STUDENT.STUDENT group by ST_GRADE, ST_CLASS;

#각 학년별 학생수를 조회
SELECT ST_GRADE, COUNT(*) AS "학생 수" FROM STUDENT.STUDENT group by ST_GRADE;

#학생 수가 5명 이상인 학년 들을 조회
SELECT ST_GRADE, COUNT(*) AS `학생 수` FROM STUDENT.STUDENT group by ST_GRADE HAVING `학생 수` >= 5;

SELECT
	ST_GRADE 학년, ST_CLASS 반, ST_NUM 번호, ST_NAME 이름,
    SJ_GRADE 학년, SJ_SEMESTER 학기, SJ_NAME 과목명, SC_SCORE 성적
FROM
	SCORE
JOIN
	STUDENT ON STUDENT.ST_KEY = SCORE.SC_ST_KEY
JOIN
	SUBJECT ON SCORE.SC_SJ_NUM = SUBJECT.SJ_NUM;
    
#뷰를 이용한 쿼리 재사용
CREATE VIEW STUDENT_SCORE AS
SELECT
	ST_GRADE 학년, ST_CLASS 반, ST_NUM 번호, ST_NAME 이름,
    SJ_GRADE 과목학년, SJ_SEMESTER 학기, SJ_NAME 과목명, SC_SCORE 성적
FROM
	SCORE
JOIN
	STUDENT ON ST_KEY = SC_ST_KEY
JOIN
	SUBJECT ON SC_SJ_NUM = SJ_NUM;

#1학년의 1학년 1학기 국어 성적을 조회하는 쿼리
SELECT * FROM STUDENT_SCORE WHERE 학년 = 1 AND 과목학년 = 1 AND 학기 = 1 AND 과목명 = "국어";

#1학년의 1학년 1학기 국어 성적의 평균을 조회하는 쿼리
SELECT 학년, 과목학년, 학기, 과목명, AVG(성적) 평균 FROM STUDENT_SCORE WHERE 학년 = 1 AND 과목학년 = 1 AND 학기 = 1 AND 과목명 = "국어";

#2학년의 1학년 2학기 국어 성적의 평균을 각 반별로 조회하는 쿼리
SELECT
	학년, 반, 과목학년, 학기, 과목명, AVG(성적) 평균
FROM
	STUDENT_SCORE
WHERE
    학년 = 2 AND 과목학년 = 1 AND 학기 = 2 AND 과목명 = "국어"
GROUP BY 반;

# 각 학생별 평균(학년, 학기별)을 조회하는 쿼리
SELECT 학년, 반, 번호, 이름, 과목학년, 학기, AVG(성적) 평균 FROM STUDENT_SCORE
GROUP BY 학년, 반, 번호, 이름, 과목학년, 학기;

# 각 학생의 학년별 평균을 조회하는 쿼리
SELECT 학년, 반, 번호, 이름, 과목학년, AVG(성적) 평균 FROM STUDENT_SCORE
GROUP BY 학년, 반, 번호, 이름, 과목학년;

# 각 학생의 1학년 평균이 가장 높은 학생을 조회하는 쿼리
SELECT 학년, 반, 번호, 이름, 과목학년, AVG(성적) 평균 FROM STUDENT_SCORE
WHERE 과목학년 = 1
GROUP BY 학년, 반, 번호, 이름, 과목학년
ORDER BY 평균 DESC
LIMIT 1;


# 모든 과목의 평균을 조회하는 쿼리
SELECT SUBJECT.*, IFNULL(AVG(SC_SCORE), "미등록") 평균
FROM
	SUBJECT
LEFT JOIN
	SCORE ON SJ_NUM = SC_SJ_NUM
GROUP BY SJ_NUM;

# 모든 학생의 학생 평균을 조회하는 쿼리
SELECT STUDENT.*, IFNULL(AVG(SC_SCORE), "미응시") 평균
FROM STUDENT
LEFT JOIN SCORE ON SC_ST_KEY = ST_KEY
GROUP BY ST_KEY;

#등록된 학생수를 조회하는 쿼리
SELECT COUNT(*) 총학생수 FROM STUDENT;

# 크로스 조인 : 모든 경우의 수를 조합하여 합치는 조인

# 내장함수 IF(식, 식1, 식2) : 식이 참이면 식1, 거짓이면 식2
# 성적이 60이상이면 통과, 60미만이면 실패라고 출력하는 쿼리
SELECT *, IF(SC_SCORE >= 60, "o", "x") AS 통과 FROM SCORE;

# 성적이 90이상이면 A, 80이상이면 B, 70이상이면 C, 60이상이면 D, 60 미만이면 F로 출력
SELECT *, 
	IF(SC_SCORE >= 90, "A",
		IF(SC_SCORE >= 80, "B",
			IF(SC_SCORE >= 70, "C",
				IF(SC_SCORE >= 60, "D","F")))) AS 학점 FROM SCORE;

SELECT *,
	CASE
		WHEN SC_SCORE >= 90 THEN "A"
        WHEN SC_SCORE >= 80 THEN "B"
        WHEN SC_SCORE >= 70 THEN "C"
        WHEN SC_SCORE >= 60 THEN "D"
        ELSE "F"
	END AS 학점
FROM SCORE;

#성적이 최고성적과 같으면 NULL, 다르면 성적을 출력
SELECT *, NULLIF(SC_SCORE, (SELECT MAX(SC_SCORE) FROM SCORE)) AS 결과 FROM SCORE;

SET GLOBAL sql_mode = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION';
SET GLOBAL sql_mode = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION, ONLY_FULL_GROUP_BY';

# 각 학생별 평균을 조회하는 쿼리
USE STUDENT;
SELECT ST_GRADE 학년, ST_CLASS 반, ST_NUM 번호, ST_NAME 이름, IFNULL(AVG(SC_SCORE), "미응시") 평균
FROM SCORE
RIGHT JOIN STUDENT ON SC_ST_KEY = ST_KEY
GROUP BY ST_KEY;

# 1학년 1반의 반 등수를 조회하는 쿼리

SELECT ST_GRADE 학년, ST_CLASS 반, ST_NUM 번호, ST_NAME 이름, IFNULL(AVG(SC_SCORE), 0) 평균
FROM SCORE
RIGHT JOIN STUDENT ON SC_ST_KEY = ST_KEY
WHERE ST_GRADE = 1 AND ST_CLASS = 1
GROUP BY ST_KEY;

# 평균이 같으면 국, 영, 수 점수 순으로 비교하여 등수를 결정. 다 같으면 같은 등수

# 같은 등수들의 다음 등수는 같은 등수만큼 건너 뜀.

SELECT RANK() OVER(ORDER BY 평균 DESC) 순위, T.*
FROM 
	(SELECT ST_GRADE 학년, ST_CLASS 반, ST_NUM 번호, ST_NAME 이름, IFNULL(AVG(SC_SCORE), 0) 평균
		FROM SCORE
		RIGHT JOIN STUDENT ON SC_ST_KEY = ST_KEY
		WHERE ST_GRADE = 1 AND ST_CLASS = 1
		GROUP BY ST_KEY) AS T;
        
# 2학년 등수를 조회하는 쿼리
SELECT RANK() OVER(ORDER BY 평균 DESC) 순위, T.*
FROM 
	(SELECT ST_GRADE 학년, ST_CLASS 반, ST_NUM 번호, ST_NAME 이름, IFNULL(AVG(SC_SCORE), 0) 평균
		FROM SCORE
		RIGHT JOIN STUDENT ON SC_ST_KEY = ST_KEY
		WHERE ST_GRADE = 2
		GROUP BY ST_KEY) AS T;



