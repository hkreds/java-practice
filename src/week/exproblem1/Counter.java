package week.exproblem1;

public class Counter {
	private int count = 0;
	private static int totalCount=0;
	public void reset(){
		count =0;
	}
	public void count(){
		totalCount+=count;
		count++;
	}
	public int getCount(){
		return count;
	}
	public static int getTotalCount(){
		return totalCount;
	}
}
