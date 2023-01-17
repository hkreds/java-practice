package week.problem8;

public class Problem8_4 {
	public static void main(String[] args) {
		int n = (int)(Math.random()*1000)+1;
		if(n>=1000) {
			System.out.println(n+"は4桁");
		}else if (n>=100) {
			System.out.println(n+"は3桁");
		}else if (n>=10) {
			System.out.println(n+"は2桁");
		}else {
			System.out.println(n+"は1桁");
		}
	}
}
