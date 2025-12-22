import java.util.*;
import java.io.*;

// -------------------------------
// タスクを表すクラス
// -------------------------------
class Task {
    String title; // タスク名
    String deadline; // 期限（任意）
    boolean done; // 完了したかどうか

    public Task(String title, String deadline, boolean done) {
        this.title = title;
        this.deadline = deadline;
        this.done = done;
    }

    // CSV形式に変換
    public String toCSV() {
        return title + "," + deadline + "," + done;
    }

    // CSVから復元
    public static Task fromCSV(String line) {
        String[] p = line.split(",");
        String title = p[0];
        String deadline = p[1];
        boolean done = Boolean.parseBoolean(p[2]);
        return new Task(title, deadline, done);
    }
}

// -------------------------------
// メインクラス
// -------------------------------
public class TodoMain {

    // CSV保存メソッド（自動保存にも使える）
    static void saveCSV(ArrayList<Task> list) {
        try (PrintWriter pw = new PrintWriter("todo.csv")) {
            for (Task t : list) {
                pw.println(t.toCSV());
            }
            System.out.println("💾 自動保存しました");
        } catch (Exception e) {
            System.out.println("⚠ 保存中にエラーが発生しました");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Task> list = new ArrayList<>();

        // -------------------------------
        // 起動時に CSV を読み込む
        // -------------------------------
        try (Scanner fs = new Scanner(new File("todo.csv"))) {
            while (fs.hasNextLine()) {
                list.add(Task.fromCSV(fs.nextLine()));
            }
            System.out.println("📂 CSVからデータを読み込みました！");
        } catch (Exception e) {
            System.out.println("（CSVファイルがまだありません）");
        }

        // -------------------------------
        // メインループ
        // -------------------------------
        while (true) {
            System.out.println("\n【ToDoリスト】");
            System.out.println("1. タスク追加");
            System.out.println("2. 一覧表示");
            System.out.println("3. 完了にする");
            System.out.println("4. 削除する");
            System.out.println("5. 検索する");
            System.out.println("6. CSV保存");
            System.out.println("7. 終了");

            System.out.print("番号 → ");
            String choice = sc.nextLine();

            switch (choice) {

                // -------------------------------
                // 1. タスク追加
                // -------------------------------
                case "1":
                    System.out.print("タスク名 → ");
                    String title = sc.nextLine();

                    System.out.print("期限（例：2025/12/31）→ ");
                    String deadline = sc.nextLine();

                    Task t = new Task(title, deadline, false);
                    list.add(t);

                    saveCSV(list); // 自動保存
                    System.out.println("✅ 追加しました！");
                    break;

                // -------------------------------
                // 2. 一覧表示
                // -------------------------------
                case "2":
                    System.out.println("\n📄 --- タスク一覧 ---");
                    if (list.isEmpty()) {
                        System.out.println("（まだタスクがありません）");
                        break;
                    }
                    for (int i = 0; i < list.size(); i++) {
                        Task item = list.get(i);
                        String mark = item.done ? "✔" : "✗";
                        System.out.println((i + 1) + ". [" + mark + "] " + item.title + "（期限：" + item.deadline + "）");
                    }
                    break;

                // -------------------------------
                // 3. 完了にする
                // -------------------------------
                case "3":
                    System.out.print("完了にしたい番号 → ");
                    int no = Integer.parseInt(sc.nextLine());

                    if (no < 1 || no > list.size()) {
                        System.out.println("⚠ 正しい番号を入力してください");
                        break;
                    }

                    list.get(no - 1).done = true;
                    saveCSV(list);
                    System.out.println("🎉 完了にしました！");
                    break;

                // -------------------------------
                // 4. 削除
                // -------------------------------
                case "4":
                    System.out.print("削除したい番号 → ");
                    int del = Integer.parseInt(sc.nextLine());

                    if (del < 1 || del > list.size()) {
                        System.out.println("⚠ 正しい番号を入力してください");
                        break;
                    }

                    list.remove(del - 1);
                    saveCSV(list);
                    System.out.println("🗑 削除しました！");
                    break;

                // -------------------------------
                // 5. 検索
                // -------------------------------
                case "5":
                    System.out.print("検索ワード → ");
                    String word = sc.nextLine();

                    System.out.println("\n🔍 --- 検索結果 ---");
                    for (Task item : list) {
                        if (item.title.contains(word)) {
                            System.out.println("- " + item.title + "（期限：" + item.deadline + "）");
                        }
                    }
                    break;

                // -------------------------------
                // 6. CSV保存
                // -------------------------------
                case "6":
                    saveCSV(list);
                    break;

                // -------------------------------
                // 7. 終了
                // -------------------------------
                case "7":
                    System.out.println("👋 アプリを終了します");
                    return;

                default:
                    System.out.println("⚠ 1〜7 を入力してください");
            }
        }
    }
}