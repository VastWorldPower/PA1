package grading;

import java.util.List;
import java.util.Map;

public class WeightedTotalStrategy implements GradingStrategy{
	private Map<String, Double> weights;
	
	public WeightedTotalStrategy() {}
	public WeightedTotalStrategy(Map<String, Double> weights) {}
	
	@Override
	public grading.Grade calculate(String key, List<Grade> grades) throws SizeException {
		// TODO Auto-generated method stub
		return null;
	}
}
