import java.util.*;

public class JankenGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // 手の配列
        String[] hands = { "グー", "チョキ", "パー" };

        while (true) {

            System.out.println("\nじゃんけん");
            System.out.println("0:グー");
            System.out.println("1:チョキ");
            System.out.println("2:パー");
            System.out.println("9:終了");
            System.out.println("0:グー");
            System.out.print("番号を入力→");

            int player = sc.nextInt();

            // 終了
            if (player == 9) {
                System.out.println("ゲームを終了します");
                break;
            }

            // 入力チェック
            if (player < 0 || player > 2) {
                System.out.println("0~2の番号を入力してください");
            }

            // CPUの手をランダムに決定
            int cpu = rand.nextInt(3);

            System.out.println("あなた:" + hands[player]);
            System.out.println("コンピュータ:" + hands[cpu]);

            // 勝敗判定
            if (player == cpu) {
                System.out.println("あいこ");
            } else if ((player == 0 && cpu == 1) || (player == 1 && cpu == 2) || (player == 2 && cpu == 0)) {
                System.out.println("あなたの勝ち");
            } else {
                System.out.println("コンピュータの勝ち");
            }

        }
    }
}
