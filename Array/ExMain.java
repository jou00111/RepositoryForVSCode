import java.util.ArrayList;
import java.util.Scanner;

public class ExMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Expense を好きなだけ入れられるリスト
        ArrayList<Expense> list = new ArrayList<>();

        while (true) {
            System.out.print("項目を入力してください（終了で終わり）: ");
            String title = sc.nextLine();

            if (title.equals("終了")) {
                break; // 入力終了
            }

            System.out.print("金額: ");
            int amount = Integer.parseInt(sc.nextLine());

            // Expense オブジェクトを作ってリストに追加
            Expense e = new Expense();
            e.title = title;
            e.amount = amount;

            list.add(e);
        }

        // 入力内容を表示
        System.out.println("\n--- 入力内容 ---");
        for (Expense e : list) {
            e.show();
        }

        // 合計を計算
        int sum = total(list);
        System.out.println("\n合計: " + sum + "円");

        sc.close();
    }

    // ArrayList 版の total
    static int total(ArrayList<Expense> list) {
        int sum = 0;
        for (Expense e : list) {
            sum += e.amount;
        }
        return sum;
    }
}