package grading;

import java.util.List;

public class DropFilter implements Filter {
	private boolean shouldDropLowest;
	private boolean shouldDropHighest;

	public DropFilter() {}
	public DropFilter(boolean shouldDropLowest, boolean shouldDropHighest) {}

	@Override
	public List<Grade> apply(List<Grade> grades) throws SizeException {
		// TODO Auto-generated method stub
		return null;
	}
}
