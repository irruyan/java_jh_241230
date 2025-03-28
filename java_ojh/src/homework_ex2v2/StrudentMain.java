package homework_ex2v2;


/*
 * 학생 성적 관리 프로그램을 작성하세요.
 * 1. 학생 등록
 *  - 학년, 반, 번호, 이름
 *  - 키(학년, 반, 번호) 동일하면 등록하지 않음
 * 2. 학생 수정
 *  - 키를 입력받아 학생이 있는지 찾고, 있으면 수정
 *  - 수정하는 정보는 학년, 반, 번호, 이름을 수정
 *  - 이미 등록된 학생 정보(1, 1, 1 오준호)에 다른 사람을 입력하지 못하게 막음
 * 3. 학생 삭제
 *  - 학년, 반, 번호를 입력받아 학생이 있는지 찾고 있으면 삭제
 * 4. 과목 등록
 *  - 학년, 학기, 과목명을 입력받아 없으면 등록
 * 5. 과목 수정
 *  - 학년, 학기, 과목을 입력받아 있으면 학년, 학기, 과목을 입력받아 수정
 *  - 수정하려는 과목이 이미 등록된 과목이면 수정하지 않음
 * 6. 과목 삭제
 * 7. 성적 등록
 * 8. 성적 수정
 * 9. 성적 삭제
 * 10. 학생 조회
 * 11. 과목 조회
 * 12. 성적 조회
 */
public class StrudentMain {
			
	public static void main(String[] args) {
		
		StudentProgram program = new StudentProgram();
		program.run();
		
	}

}
