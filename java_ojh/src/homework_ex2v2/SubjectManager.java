package homework_ex2v2;

import java.util.ArrayList;
import java.util.List;

import homework_ex2v1.Subject;
import lombok.Data;

@Data
public class SubjectManager {
	
	private List<Subject> list;
	
	public SubjectManager(List<Subject> list) {
		this.list = list;
	}
	
	public SubjectManager() {
		this.list = new ArrayList<Subject>();
	}

}
