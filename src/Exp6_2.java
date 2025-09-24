public class Exp6_2 {
	public static void main(String[] args) {
		int n = 13; //  開始値 
		int step = 0; //  何回かかったか数える 

		while (n != 1) {
			step++; // 1 回処理をするごとにカウント  
			if (n % 2 == 0) {
				n = n / 2; //  偶数なら 2 で割る 
			} else {
				n = 3 * n + 1; //  奇数なら 3 倍して 1 を足す 
			}
		}
	}
}