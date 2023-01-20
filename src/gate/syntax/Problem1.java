package gate.syntax;

public class Problem1 {
	public static void main(String[] args) {
		System.out.println("引数は" + args.length + "個指定されています。");
    for(int idx = 0 ; idx < args.length; idx ++){
        System.out.println((idx + 1 ) + "番目の引数は「" + args[idx] + "」です。");
    }
	}
}
