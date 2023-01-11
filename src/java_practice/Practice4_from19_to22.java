package java_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4_from19_to22 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("練習問題4-19");
		int i = 1, count = 0;
		int sum = 0;
		while (i !=0) {
			System.out.print("数値を入力：");
			i = Integer.parseInt(br.readLine());
			sum += i;
			if (i!=0) {
				count += 1;
			}
		}
		System.out.println("平均：" +sum/count);
		
		System.out.println("練習問題4-20");
		System.out.println("サイズを入力");
		int size = Integer.parseInt(br.readLine());
		for(count=1;count<=size;count++) {
			for(int times=0;times<count;times++) {
				System.out.print("$");
			}
			System.out.println();
		}
		
		System.out.println("練習問題4-21");
		System.out.println("サイズを入力");
		size = Integer.parseInt(br.readLine());
		for(int y=0;y<size;y++) {
			for(int x=0;x<=size;x++) {
				if(x==y||x==size-y-1) {
					System.out.print("X");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("練習問題4-22");
		int a = 0, b = 1,c = a+b;
		while(b<1000) {
			System.out.print(a+",");
			a = b;
			b = c;
			c = a + b;
		}
		System.out.println(a);
	}
}
