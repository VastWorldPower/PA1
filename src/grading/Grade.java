package grading;

public final class Grade implements Comparable<grading.Grade> {
	private final String key;
	private final Double value;
	
	public Grade(String key) throws IllegalArgumentException {
		if (key == null || key.equals("")) {
			throw new IllegalArgumentException("Error, key cannot be null or be an empty string");
		}
		
		this.key = key;
		this.value = null;
	}
	
	public Grade(String key, double value) throws IllegalArgumentException {
		if (key == null || key.equals("")) {
			throw new IllegalArgumentException("Error, key cannot be null or be an empty string");
		}
		
		this.key = key;
		this.value = value;
	}
	
	public Grade(String key, Double value) throws IllegalArgumentException {
		if (key == null || key.equals("")) {
			throw new IllegalArgumentException("Error, key cannot be null or be an empty string");
		}
		
		this.key = key;
		this.value = value;
	}
	
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
