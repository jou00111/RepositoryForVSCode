import java.util.*;

public class GuessGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = new Random().nextInt(100) + 1; // 1から100のランダムな数を生成

        while (true) {
            System.out.print("数字を入力→");
            int n = sc.nextInt();

            if (n == ans) {
                System.out.println("正解!");
                break;
            } else if (n < ans) {
                System.out.println("もっと大きいよ");
            } else {
                System.out.println("もっと小さいよ");
            }
        }

        sc.close();
    }
}
