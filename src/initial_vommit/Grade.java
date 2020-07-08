package initial_vommit;

public class Grade {
	private static final int MAXIMUM_GRADE = 20;
	private final double value;
	private final boolean isAbsent;
	
	public Grade(double value, boolean isAbsent) throws IllegalArgumentException{
		if(value < 0 || value > 20)
			throw new IllegalArgumentException("");
		this.value = value;
		this.isAbsent = isAbsent;
	}
	public Grade() {
		this.value = 0;
		this.isAbsent = true;
	}
	public Grade(double value) {
		this.value = value;
		this.isAbsent = false;
	}
	
	public boolean isAbsent() {
		return !isAbsent;
	}
	
	public double getValue() {
		return value;
	}
	
	String tostring() {
		if(isAbsent)
			return "ABS";
		else
			return (value+"/"+MAXIMUM_GRADE);
	}
}
