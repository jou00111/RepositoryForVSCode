import java.util.ArrayList;
import java.util.Scanner;

public class Ex3Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // キーボード入力を受け取るための Scanner

        // Expense3 を好きなだけ入れられるリスト（配列と違ってサイズ自由）
        ArrayList<Expense3> list = new ArrayList<>();

        // 「終了」と入力されるまで繰り返す無限ループ
        while (true) {
            System.out.println("\n---メニューｰ");
            System.out.println("1. 家計簿を入力する");
            System.out.println("2. 家計簿一覧を見る");
            System.out.println("3. 合計金額を見る");
            System.out.println("4. 終了する");
            System.out.print("番号を選んでください: ");

            String choise = sc.nextLine(); ///メニュー番号を入力

            switch ((choise)) {
                case "1":

                    // ---家計簿を入力---
                    System.out.print("項目:");
                    String title = sc.nextLine();

                    System.out.println("金額: ");
                    int amount = Integer.parseInt(sc.nextLine());

                    Expense3 e = new Expense3();
                    e.title = title;
                    e.amount = amount;

                    list.add(e);
                    System.out.println("追加しました!");
                    break;
                case "2":
                    // --- 一覧表示 ---
                    System.out.println(("\n---家計簿一覧---"));
                    for (Expense3 o : list) {
                        o.show();
                    }
                    break;

                case "3":
                    // --ｰ合計表示 ---
                    int sum = total(list);
                    System.out.println("合計:" + sum + "円");
                    break;

                case "4":
                    // ---終了---
                    System.out.println("終了します。");
                    sc.close();
                    return; // main を終了
                default:
                    System.err.println("1～4の番号を入力してください。");
            }
        }

    }

    // 合計金額を計算するメソッド
    static int total(ArrayList<Expense3> list) {
        int sum = 0;
        for (Expense3 e : list) {
            sum += e.amount;
        }
        return sum;
    }
}