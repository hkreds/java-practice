package gate;

public class Toukei {
  public static void main(String[] args) {
  	double sum=0,max=0,min=999;
  	int[] nums = new int[100];
		for(int count=0;count<100;count++) {
			int n = (int)(Math.random()*1000);
			sum += n;
			if(max<n) {
				max = n;
			}else if (min>n) {
				min = n;
			}
			nums[count] = n;
		}
		double ave = sum/100;
		System.out.println("合計："+sum+", 最大値："+max+", 最小値："+min+", 平均値："+ave);
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%4d",nums[i]);
			if((i+1)%10==0) {
				System.out.println();
			}
		}
	}
}
