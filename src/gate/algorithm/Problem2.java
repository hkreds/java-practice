package gate.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] param = input.split(" ");
		int a = Integer.parseInt(param[0]);
		int b = Integer.parseInt(param[2]);
		if(param[1].equals("+")) {
			System.out.println(a+b);
		}else if(param[1].equals("-")) {
			System.out.println(a-b);
		}else if(param[1].equals("*")) {
			System.out.println(a*b);
		}else if(param[1].equals("/")) {
			System.out.println(a/b);
		}
	}
}
