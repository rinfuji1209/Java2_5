import java.util.Random;
import java.util.Scanner;

public class Exp5_3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("サイコロを降りますか？（y/n):");
		String input = scanner.nextLine();

		if (input.equals("y")) {
			int dice = rand.nextInt(6) + 1;
			System.out.println("出た目は:" + dice);

		} else if (input.equals("n")) {
			System.out.println("ゲームを終了します。");
		} else {
			System.out.println("ｙかｎを入力してください。");
		}
		scanner.close();

	}
}