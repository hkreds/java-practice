package gate.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] param = input.split(" ");
		int sum = 0;
		String calc = "+";
		for(int i=0;i<param.length;i++) {
			if(i%2==0&&calc=="+") {
				sum += Integer.parseInt(param[i]);
			}else if (i%2==0&&calc=="-") {
				sum -= Integer.parseInt(param[i]);
			}else if (param[i].equals("+")) {
				calc = "+";
			}else if (param[i].equals("-")) {
				calc = "-";
			}
		}
		System.out.println(sum);
	}
}
