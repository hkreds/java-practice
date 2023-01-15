package java_practice;

public class CoinCase {
	//練習問題7-5
	private int[] Counts = new int[6];
	public void AddCoins(int kind, int count) {
		if(kind==500) {
			Counts[0] += count;
		}else if (kind==100) {
			Counts[1] += count;
		}else if (kind==50) {
			Counts[2] += count;
		}else if (kind==10) {
			Counts[3] += count;
		}else if (kind==5) {
			Counts[4] += count;
		}else if (kind==1) {
			Counts[5] += count;
		}
	}
	public int GetCount(int kind) {
		if(kind==500) {
			return Counts[0];
		}else if (kind==100) {
			return Counts[1];
		}else if (kind==50) {
			return Counts[2];
		}else if (kind==10) {
			return Counts[3];
		}else if (kind==5) {
			return Counts[4];
		}else if (kind==1) {
			return Counts[5];
		}else {
			return 0;
		}
	}
	public int GetAmount() {
		return (500*Counts[0])+(100*Counts[1])+(50*Counts[2])+(10*Counts[3])+(5*Counts[4])+(1*Counts[5]);
	}
	//練習問題7-6
	public int AllGetCount() {
		return Counts[0]+Counts[1]+Counts[2]+Counts[3]+Counts[4]+Counts[5];
	}
	public int EachGetAmount(int kind) {
		if(kind==500) {
			return Counts[0]*500;
		}else if (kind==100) {
			return Counts[1]*100;
		}else if (kind==50) {
			return Counts[2]*50;
		}else if (kind==10) {
			return Counts[3]*10;
		}else if (kind==5) {
			return Counts[4]*5;
		}else if (kind==1) {
			return Counts[5]*1;
		}else {
			return 0;
		}
	}
}
