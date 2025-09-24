public class Exp6_1 {
	public static void main(String[] args) {
		int[] prices = { 950, 1280, 1355, 1765, 355, 10255 };

		int amount = 0;
		for (int price : prices) {
			double discounted = price * 0.95;
			int line = (int) discounted;
			amount += line;
		}
		System.out.println("代金：" + amount);

	}
}