# 사용자 추가
# '아이디'@'호스트명' IDENTIFIED BY '비밀번호';
# 아이디 = 사용자 계정명, 호스트명 = 접근 권한

CREATE USER 'community_admin'@'%' IDENTIFIED BY 'admin';

#사용자 조회
SELECT USER, HOST FROM MYSQL.USER;

#비번 변경
SET PASSWORD FOR 'community_admin'@'%' = 'admin123';

#사용자 삭제
DROP USER 'community_admin'@'%';

CREATE USER 'community_admin'@'%' IDENTIFIED BY 'admin';

#권한 부여
GRANT SELECT ON COMMUNITY.* TO 'community_admin'@'%';
GRANT ALL PRIVILEGES ON COMMUNITY.* TO 'community_admin'@'%';

#권한 제거
REVOKE INSERT ON COMMUNITY.* FROM 'community_admin'@'%';
