package grading;

public class Missing {
	private static final double DEFAULT_MISSING_VALUE = 0;
	
	public double doubleValue(Double number) {
		return DEFAULT_MISSING_VALUE;
	}
	
	public double doubleValue(Double number, double missingValue) {
		return DEFAULT_MISSING_VALUE;
	}
}
