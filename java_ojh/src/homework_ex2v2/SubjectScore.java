package homework_ex2v2;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SubjectScore  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -845060865380765459L;
	private Subject subject;
	private int score;
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SubjectScore other = (SubjectScore) obj;
		return Objects.equals(subject, other.subject);
	}
	@Override
	public String toString() {
		return subject + " " + score + "점";
	}
	
	
}
