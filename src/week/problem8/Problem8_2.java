package week.problem8;

public class Problem8_2 {
	public static void main(String[] args) {
		int count = 0;
		for(int a=1;a<=100;a++) {
			for(int b=1;b<=100;b++) {
				for(int c=1;c<=100;c++) {
					if((a*a)+(b*b)==(c*c)&&a<b) {
						count += 1;
						System.out.println("a="+a+",b="+b+",c="+c);
					}
				}
			}
		}
		System.out.println("a*a+b*b=c*cを満たす、a,b,cの組み合わせ(重複を取り除く)は"+count+"通り");
	}
}
