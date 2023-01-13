package java_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("練習問題5-1");
		int[] nums = new int[10];
		for (int i=0;i<10;i++) {
			System.out.print("数字を10回入力、" + (i+1) + "回目：");			
			nums[i] = Integer.parseInt(br.readLine());
		}
		for (int i=0;i<10;i++) {
			System.out.println(nums[i] * 2);
		}
		
		System.out.println("練習問題5-2");
		for(int i=9;i>=0;i--) {
			System.out.println(nums[i]);
		}
		
		System.out.println("練習問題5-3");
		System.out.print("偶数：");
		for(int i=0;i<10;i++) {
			if(nums[i]%2==0) {
				System.out.print(nums[i] + " ");
			}
		}
		System.out.print("\n奇数：");
		for(int i=0;i<10;i++) {
			if(nums[i]%2==1) {
				System.out.print(nums[i] + " ");
			}
		}
		
		System.out.println("\n練習問題5-4");
		int[] ns = new int[10];
		int count = 0;
		for (int i=0,sum=0;i<10&&sum<=100;i++) {
			System.out.print("数字を10回入力、" + (i+1) + "回目：");			
			ns[i] = Integer.parseInt(br.readLine());
			sum += ns[i];
			count += 1;
		}
		for (int i=0;i<count;i++) {
			System.out.println(ns[i]);
		}

		System.out.println("練習問題5-5");
		int value = Integer.parseInt( br.readLine() );
		int binary[] = new int[16];
		for( int i = 15 ; i >= 0 ; i--, value /= 2 ) {
	    binary[i] = value % 2;
		}
		for( int i = 0 ; i < 16 ; i++ ) {
		  System.out.print( binary[i] );
		}

		System.out.println("練習問題5-6");
		int kuku[][] = new int[9][9];
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				kuku[i][j] = (i+1)*(j+1);
			}
		}
		for( int i = 0 ; i < 9 ; i++ ){
		  for( int j = 0 ; j < 9 ; j++ ) {
		    System.out.printf( " %2d", kuku[i][j] );
		  }
		  System.out.println();
		}
		
		System.out.println("練習問題5-7");
		System.out.print("1つ目の数字を入力：");
		int a = Integer.parseInt(br.readLine());
		System.out.print("2つ目の数字を入力：");
		int b = Integer.parseInt(br.readLine());
		System.out.println(a + "x" + b + "=" + kuku[a-1][b-1]);
		
		System.out.println("練習問題5-7");
		int[] numbers = new int[10];
		for (int i=0;i<10;i++) {
			System.out.print("数字を10回入力、" + (i+1) + "回目：");			
			numbers[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0;i<10;i++) {
			for(int j=i+1;j<10;j++) {
				if(numbers[i] > numbers[j]) {
					int t = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = t;
				}
			}
		}
		for(int i=0;i<10;i++) {
			System.out.print(numbers[i] + " " );
		}
	}
}
