package java_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		System.out.println("練習問題7-1");
		Dog dog = new Dog("柴犬");
		dog.SetName("犬");
		dog.ShowProfile();
		
		System.out.println("練習問題7-2");
		dog.SetAge(3);
		dog.ShowProfile();
		
		System.out.println("練習問題7-3");
		Dog dog1 = new Dog("チワワ");
		Dog dog2 = new Dog("チワワ");
		dog1.SetName("タロー");
		dog1.SetAge(1);
		dog2.SetName("ジロー");
		dog2.SetAge(2);
		dog1.ShowProfile();
		dog2.ShowProfile();
		
		System.out.println("練習問題7-4");
		Dog dog3 = new Dog("秋田犬");
		dog3.SetName("サブロー");
		dog3.SetAge(4);
		dog3.ShowProfile();

		System.out.println("練習問題7-5");
		CoinCase case5 = new CoinCase();
		for (int i= 0;i<=10;i++) {
			System.out.print( "硬貨の種類は?" );
      int kind = Integer.parseInt( br.readLine() );
      System.out.print( "硬貨の枚数は?" );
      int count = Integer.parseInt( br.readLine() );
      case5.AddCoins(kind,count);
		}
		System.out.println("500円："+case5.GetCount(500)+"枚");
		System.out.println("100円："+case5.GetCount(100)+"枚");
		System.out.println("50円："+case5.GetCount(50)+"枚");
		System.out.println("10円："+case5.GetCount(10)+"枚");
		System.out.println("5円："+case5.GetCount(5)+"枚");
		System.out.println("1円："+case5.GetCount(1)+"枚");
		System.out.println("総額:"+case5.GetAmount()+"円");

		System.out.println("練習問題7-6");
		CoinCase case6 = new CoinCase();
		for (int i= 0;i<=10;i++) {
			System.out.print( "硬貨の種類は?" );
      int kind = Integer.parseInt( br.readLine() );
      System.out.print( "硬貨の枚数は?" );
      int count = Integer.parseInt( br.readLine() );
      case6.AddCoins(kind,count);
		}
		System.out.println("500円："+case6.GetCount(500)+"枚、"+case6.EachGetAmount(500)+"円");
		System.out.println("100円："+case6.GetCount(100)+"枚、"+case6.EachGetAmount(100)+"円");
		System.out.println("50円："+case6.GetCount(50)+"枚、"+case6.EachGetAmount(50)+"円");
		System.out.println("10円："+case6.GetCount(10)+"枚、"+case6.EachGetAmount(10)+"円");
		System.out.println("5円："+case6.GetCount(5)+"枚、"+case6.EachGetAmount(5)+"円");
		System.out.println("1円："+case6.GetCount(1)+"枚、"+case6.EachGetAmount(1)+"円");
		System.out.println("全部で"+case6.AllGetCount()+"枚");
		System.out.println("総額:"+case6.GetAmount()+"円");
	}
}
