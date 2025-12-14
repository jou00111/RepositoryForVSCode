import java.util.ArrayList;
import java.util.Scanner;

public class ExMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // キーボード入力を受け取るための Scanner

        // Expense2 を好きなだけ入れられるリスト（配列と違ってサイズ自由）
        ArrayList<Expense2> list = new ArrayList<>();

        // 「終了」と入力されるまで繰り返す無限ループ
        while (true) {

            System.out.print("項目を入力してください（終了で終わり）: ");
            String title = sc.nextLine();
            // nextLine() で項目を文字列として受け取る

            if (title.equals("終了")) {
                break; // 入力終了
            }

            System.out.print("金額: ");
            int amount = Integer.parseInt(sc.nextLine());
            // 金額も nextLine() で受け取ってから整数に変換
            // nextInt() を使うと改行が残って入力ズレが起きるため、この方法が安全

            // Expense2 オブジェクトを作成して値をセット
            Expense2 e = new Expense2();
            e.title = title;
            e.amount = amount;

            // リストに追加（ArrayList はサイズが自動で増える）
            list.add(e);
        }

        // 入力された内容を表示
        System.out.println("\n--- 入力内容 ---");
        for (Expense2 e : list) {
            e.show(); // Expense2 の show() メソッドで表示
        }

        // 合計金額を計算
        int sum = total(list);
        System.out.println("\n合計: " + sum + "円");

        sc.close(); // Scanner を閉じる（お作法）
    }

    // ArrayList 版の合計計算メソッド
    static int total(ArrayList<Expense2> list) {
        int sum = 0;

        // リスト内のすべての金額を足す
        for (Expense2 e : list) {
            sum += e.amount;
        }

        return sum;
    }
}