import java.util.ArrayList;
import java.util.Scanner;

public class Ex3Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // キーボード入力を受け取る Scanner

        ArrayList<Expense3> list = new ArrayList<>();
        // Expense3 を好きなだけ入れられるリスト（配列と違ってサイズ自由）
        String[] categories = { "食費", "交通費", "日用品", "娯楽", "その他" };

        // -------------------------------
        // テーマ選択（見た目を変える）
        // -------------------------------
        System.out.println("=== テーマを選んでください ===");
        System.out.println("1. クラシック");
        System.out.println("2. ブルー");
        System.out.println("3. ポップ");
        System.out.print("番号 → ");

        int theme = Integer.parseInt(sc.nextLine());
        // 選んだテーマ番号を保存

        // -------------------------------
        // メインループ（メニュー方式）
        // -------------------------------
        while (true) {

            // -------------------------------
            // テーマごとにメニューの見た目を変える
            // -------------------------------
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

            // -------------------------------
            // メニュー表示
            // -------------------------------
            System.out.println("【メニュー】");
            System.out.println("  1. 家計簿を入力する");
            System.out.println("  2. 家計簿一覧を見る");
            System.out.println("  3. 合計金額を見る");
            System.out.println("  4. 家計簿を削除する");
            System.out.println("  5. カテゴリ別合計を見る");
            System.out.println("  6. 終了する");

            System.out.print("\n番号を入力してください → ");
            String choice = sc.nextLine(); // メニュー番号を文字列で受け取る

            // -------------------------------
            // メニュー処理
            // -------------------------------
            switch (choice) {

                // -------------------------------
                // 1. 家計簿を入力する
                // -------------------------------
                case "1":
                    System.out.println("カテゴリを選んでください:");
                    for (int i = 0; i < categories.length; i++) {
                        System.out.println((i + 1) + ". " + categories[i]);
                    }
                    System.out.print("番号 → ");

                    int catNo = Integer.parseInt(sc.nextLine());

                    if (catNo < 1 || catNo > categories.length) {
                        System.out.println("⚠ 正しい番号を入力してください。");
                        break;
                    }

                    String category = categories[catNo - 1];

                    // -------------------------------
                    // 2. 家計簿一覧を見る
                    // -------------------------------
                case "2":
                    System.out.println("\n📄 --- 家計簿一覧 ---");

                    // 番号付きで表示するため、普通の for 文を使う
                    for (int i = 0; i < list.size(); i++) {
                        Expense3 item = list.get(i);
                        System.out.println((i + 1) + ". [" + item.category + "] "
                                + item.title + " : " + item.amount + "円");
                    }
                    break;

                // -------------------------------
                // 3. 合計金額を見る
                // -------------------------------
                case "3":
                    int sum = total(list); // 合計計算メソッドを呼ぶ
                    System.out.println("\n💰 合計: " + sum + "円");
                    break;

                // -------------------------------
                // 4. 家計簿を削除する
                // -------------------------------
                case "4":
                    if (list.isEmpty()) {
                        System.out.println("⚠️ 削除できるデータがありません");
                        break;
                    }

                    System.out.println("\n削除したい番号を入力してください。");

                    // 番号付きで一覧表示
                    for (int i = 0; i < list.size(); i++) {
                        Expense3 item = list.get(i);
                        System.out.println((i + 1) + ". [" + item.category + "] "
                                + item.title + " : " + item.amount + "円");
                    }

                    System.out.print("番号 → ");
                    int del = Integer.parseInt(sc.nextLine());

                    // 入力チェック
                    if (del < 1 || del > list.size()) {
                        System.out.println("⚠️ 正しい番号を入力してください。");
                        break;
                    }

                    list.remove(del - 1); // index は 0 始まりなので -1
                    System.out.println("✅ 削除しました！");
                    break;

                // -------------------------------
                // 5. カテゴリ別合計を見る
                // -------------------------------
                case "5":
                    // カテゴリ一覧
                    System.out.println("カテゴリを選んでください:");
                    for (int i = 0; i < categories.length; i++) {
                        System.out.println((i + 1) + ". " + categories[i]);
                    }
                    System.out.print("番号 → ");

                    int catNo5 = Integer.parseInt(sc.nextLine());

                    if (catNo5 < 1 || catNo5 > categories.length) {
                        System.out.println("⚠ 正しい番号を入力してください。");
                        break;
                    }

                    String target = categories[catNo5 - 1];

                    int catSum = 0;

                    for (Expense3 item : list) {
                        if (item.category.equals(target)) {
                            catSum += item.amount;
                        }
                    }

                    System.out.println("\n📚 「" + target + "」の合計: " + catSum + "円");

                case "6":
                    System.out.println("👋 アプリを終了します。");
                    sc.close();
                    return; // main メソッドを終了 → プログラム終了

                // -------------------------------
                // その他（入力ミス）
                // -------------------------------
                default:
                    System.out.println("⚠ 1〜6 の番号を入力してください。");
                    continue;
            }
        }
    }

    // -------------------------------
    // 合計金額を計算するメソッド
    // -------------------------------
    static int total(ArrayList<Expense3> list) {
        int sum = 0;
        for (Expense3 e : list) {
            sum += e.amount;
        }
        return sum;
    }
}