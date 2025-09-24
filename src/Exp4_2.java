public class Exp4_2 {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 3, 67, 22, 90, 15};

        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("最大値は " + max + " です");
    }
}
