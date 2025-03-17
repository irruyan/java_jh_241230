package homework_ex2v1;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Subject implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3555165651910542205L;
	public int grade;
	public int semester; //학기
	public String name;
	
	@Override
	public String toString() {
		return grade + "학년 " + semester + "학기 " + name;
	}
	

}
