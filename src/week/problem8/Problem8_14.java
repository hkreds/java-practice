package week.problem8;

public class Problem8_14 {
	public static int sum_yakusuu(int i) {
		int sum = 0;
		for(int j=1;j<=i/2;j++) {
			if(i%j==0) {
				sum += j;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("友愛数");
		for(int a=1;a<=10000;a++){
			int b = sum_yakusuu(a);
			if(a == sum_yakusuu(b) && b < a){
				System.out.println(b + " " + a);
			}
		}
		System.out.println("ロッカー問題");
		int[] lockers = new int[50];
		for(int i=0;i<50;i++) {
			lockers[i] = 1;
		}
		for(int student=1;student<=50;student++) {
			for(int i=student-1;i<50;i+=student) {
				if(lockers[i]==-1) {
					lockers[i] = 1;
				}else if (lockers[i]==1) {
					lockers[i] = -1;
				}
			}
		}
		int open = 0;
		System.out.print("空いているロッカー番号：");
		for(int i=0;i<50;i++) {
			if(lockers[i]==-1) {
				open += 1;
				System.out.print(i+1+" ");
			}
		}
		System.out.println();
		System.out.println("空いているロッカーの数："+open+"個");
	}
}
