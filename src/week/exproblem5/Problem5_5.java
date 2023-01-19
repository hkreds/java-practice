package week.exproblem5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problem5_5 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		//  コンソールから文字列の読み込み
		ArrayList<String> strs = new ArrayList<String>();
		System.out.print("文字列を入力:");
		String buf = br.readLine();
		strs.add(buf);
		while(true) {
			System.out.print("文字列を入力:");
			buf = br.readLine();
			if(buf.equals("")) {
				break;
			}
			strs.add(buf);
		}
		ArrayList<String> remove = new ArrayList<String>();
		for (String str : strs) {
			if(str.length()>=5) {
				remove.add(str);
			}
		}
		strs.removeAll(remove);
		for (String str : strs) {
			System.out.print(str+" ");
		}
	}
}