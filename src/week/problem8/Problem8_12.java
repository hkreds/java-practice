package week.problem8;

public class Problem8_12 {
	public static void main(String[] args) {
		System.out.println("エラトステネスのふるい");
		int n = 100;
		int[] array = new int[n];
		for(int i=2;i<100;i++) {
			array[i] = 1;
		}
		for(int i=2;i<100;i++) {
			if(array[i]==1) {
				System.out.print(i + " ");
				for(int k=2;i*k<n;k++) {
					array[i*k]=0;
				}
			}
		}
		System.out.println();
		System.out.println("素因数分解");
		int m = (int) (Math.random()*99)+2;
		System.out.println(m);
		int m_fix = m;
		for(int i=2;i<=m_fix;i++) {
			if(m%i==0&&m!=i) {
				m /= i;
				System.out.print(i+" x ");
				i--;
			}else if (m==i) {
				System.out.println(i);
			}
		}
	}
}
