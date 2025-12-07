import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n=== ToDoリスト ===");
            System.out.println("1. タスクを追加");
            System.out.println("2. タスクを表示");
            System.out.println("3. タスクを削除");
            System.out.println("4. 終了");
            System.out.print("選択してください: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("数字で入力してください。");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("追加するタスク: ");
                    String task = scanner.nextLine();
                    todoList.add(task);
                    System.out.println("タスクを追加しました！");
                    break;
                case 2:
                    System.out.println("\n【現在のタスク】");
                    if (todoList.isEmpty()) {
                        System.out.println("タスクはありません。");
                    } else {
                        for (int i = 0; i < todoList.size(); i++) {
                            System.out.println((i + 1) + ". " + todoList.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("削除するタスク番号: ");
                    try {
                        int index = Integer.parseInt(scanner.nextLine()) - 1;
                        if (index >= 0 && index < todoList.size()) {
                            todoList.remove(index);
                            System.out.println("タスクを削除しました！");
                        } else {
                            System.out.println("無効な番号です。");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("数字で入力してください。");
                    }
                    break;
                case 4:
                    System.out.println("終了します。お疲れさまでした！");
                    scanner.close();
                    return;
                default:
                    System.out.println("1〜4の数字で選択してください。");
            }
        }
    }
}