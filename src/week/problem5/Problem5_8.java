package week.problem5;

public class Problem5_8 {
	public static void main(String[] args) {
		int[] data = new int[5];
		for(int i=0;i<5;i++) {
			data[i] = (int)(Math.random()*21)-10;
			System.out.print(data[i] + " ");
		}
		System.out.println();
		int more_0_count = 0;
		int less_0_count = 0;
		int equal_0_count = 0;
		for(int i=0;i<5;i++) {
			if(data[i]>0) {
				more_0_count += 1;
			}else if (data[i]<0) {
				less_0_count += 1;
			}else {
				equal_0_count += 1;
			}
		}
		System.out.println("0より大きい数：" + more_0_count + "個");
		System.out.println("0より小さい数：" + less_0_count + "個");
		System.out.println("0の個数：" + equal_0_count + "個");
	}
}
