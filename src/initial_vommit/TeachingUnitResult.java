package initial_vommit;

public class TeachingUnitResult {
	
	private final String teachingUnitName;
	private final Grade grade;

	public TeachingUnitResult(String teachingUnitName, Grade grade) {
		super();
		this.teachingUnitName = teachingUnitName;
		this.grade = grade;
	}

	public Grade getGrade() {
		return grade;
	}
	
	public String toString() {
		return this.teachingUnitName +
				":" +
				this.grade;
		
	}
}