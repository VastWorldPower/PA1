package grading;

public class Grade implements Comparable<grading.Grade> {
	private String key;
	private Double value;
	
	public Grade(String key) throws IllegalArgumentException {}
	
	public Grade(String key, double value) throws IllegalArgumentException {}
	
	public Grade(String key, Double value) throws IllegalArgumentException {}
	
	public String getKey() { return key; }
	
	public Double getValue() { return value; }
	
	public String toString() {
		return key + ": " + value;
	}

	@Override
	public int compareTo(Grade other) {
		return Double.compare(value, other.getValue());
	}
}
