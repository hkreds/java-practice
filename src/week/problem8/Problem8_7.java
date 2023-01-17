package week.problem8;

public class Problem8_7 {
	public static void main(String[] args) {
		int c1 = (int) (Math.random()*10)+1;
		int m1 = (int) (Math.random()*9)+2;
		int c2 = (int) (Math.random()*10)+1;
		int m2 = (int) (Math.random()*9)+2;
		int obi1 = 0;
		System.out.println(c1+"/"+m1 +"+"+c2+"/"+m2);
		String first_n;
		int c1c = c1;
		if(c1c>=m1) {
			while(m1<=c1c) {
				obi1 += 1;
				c1c -= m1;
			}
		}
		if(obi1==0) {
			first_n = c1c + "/" + m1;
		}else if (c1c==0) {
			first_n = obi1+"";
		}else {
			first_n = obi1+"."+c1c+"/"+m1;
		}
		int obi2 = 0;
		int c2c = c2;
		String second_n;
		if(c2c>=m2) {
			while(m2<=c2c) {
				obi2 += 1;
				c2c -= m2;
			}
		}
		if(obi2==0) {
			second_n= c2c + "/" + m2;
		}else if (c2c==0) {
			second_n = obi2+"";
		}else {
			second_n= obi2+"."+c2c+"/"+m2;
		}
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
