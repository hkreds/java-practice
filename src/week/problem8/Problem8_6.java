package week.problem8;

public class Problem8_6 {
	public static void main(String[] args) {
		int c1 = (int) (Math.random()*10)+1;
		int m1 = (int) (Math.random()*9)+2;
		int c2 = (int) (Math.random()*10)+1;
		int m2 = (int) (Math.random()*9)+2;
		String first_n = c1 + "/" + m1;
		String second_n = c2 + "/" + m2;
		int child = c1*m2+c2*m1;
		int mother = m1*m2;
		for(int i=1;i<=m1;i++) {
			if(mother%i==0&&child%i==0) {
				mother /= i;
				child /= i;
			}
		}
		int obi = 0;
		while(mother<=child) {
			obi += 1;
			child -= mother;
		}
		if(obi==0) {
			System.out.println(first_n+" + "+second_n+" = "+child+"/"+mother);
		}else if (child%mother==0) {
			System.out.println(first_n+" + "+second_n+" = "+obi);
		}else {
			System.out.println(first_n+" + "+second_n+" = "+obi+"."+child+"/"+mother);
		}
	}
}
