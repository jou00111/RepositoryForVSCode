import java.util.ArrayList;
import java.util.Scanner;

public class Ex3Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // キーボード入力を受け取るための Scanner

        // Expense3 を好きなだけ入れられるリスト（配列と違ってサイズ自由）
        ArrayList<Expense3> list = new ArrayList<>();

        // 「終了」と入力されるまで繰り返す無限ループ
        // テーマ選択
        System.out.println("=== テーマを選んでください ===");
        System.out.println("1. クラシック");
        System.out.println("2. ブルー");
        System.out.println("3. ポップ");
        System.out.print("番号 → ");

        int theme = Integer.parseInt(sc.nextLine());

        while (true) {

            // テーマごとにメニューの見た目を変える
            if (theme == 1) {
                System.out.println("\n==============================");
                System.out.println("        家計簿アプリ");
                System.out.println("==============================");
            } else if (theme == 2) {
                System.out.println("\n■■■■■■■■■■■■■■■■■■■■■■■■");
                System.out.println("        ◆ 家計簿アプリ ◆");
                System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■");
            } else if (theme == 3) {
                System.out.println("\n✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨");
                System.out.println("        ★ 家計簿アプリ ★");
                System.out.println("✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨");
            }

            System.out.println("【メニュー】");
            System.out.println("  1. 家計簿を入力する");
            System.out.println("  2. 家計簿一覧を見る");
            System.out.println("  3. 合計金額を見る");
            System.out.println("  4. 家計簿を削除する");
            System.out.println("  5. 終了する");

            System.out.print("\n番号を入力してください → ");
            String choice = sc.nextLine();

            // ここから先は今までの switch(choice) と同じ
            switch (choice) {

                case "1":
                    System.out.print("項目: ");
                    String title = sc.nextLine();

                    System.out.print("金額: ");
                    int amount = Integer.parseInt(sc.nextLine());

                    Expense3 e = new Expense3();
                    e.title = title;
                    e.amount = amount;

                    list.add(e);
                    System.out.println("✅ 追加しました！");
                    break;

                case "2":
                    System.out.println("\n📄 --- 家計簿一覧 ---");
                    for (Expense3 ex : list) {
                        ex.show();
                    }
                    break;

                case "3":
                    int sum = total(list);
                    System.out.println("\n💰 合計: " + sum + "円");
                    break;

                case "4":
                    // --削除機能追加--
                    if (list.isEmpty()) {
                        System.out.println("⚠️削除できるデータがありません");
                        break;
                    }
                    System.out.println("\n削除したい番号を入力してください。");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + "." + list.get(i).title + ":" + list.get(i).amount + "円");
                    }
                    System.out.print("番号");
                    int del = Integer.parseInt(sc.nextLine());

                    if (del < 1 || del > list.size()) {
                        System.out.println("⚠️正しい番号を入力してください。");
                        break;
                    }
                    list.remove(del - 1);
                    System.out.println("✅削除しました！");
                    break;

                case "5":
                    System.out.println("👋 アプリを終了します。");
                    sc.close();
                    return;

                default:
                    System.out.println("⚠ 1〜4の番号を入力してください。");
                    continue;
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