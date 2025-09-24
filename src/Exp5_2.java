class Exp5_2 {
	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.println("整数を 3 つ指定してください。");
			return;
		}

		int sum = 0;
		int num = 0;
		for (int i = 0; i < args.length; i++) {
			num = Integer.parseInt(args[i]);
			sum += num;
		}

		System.out.println("合計：" + sum);
	}
}