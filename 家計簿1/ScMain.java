import java.util.Scanner;

public class ScMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Expense1[] list = new Expense1[3];

        for (int i = 0; i < 3; i++) {
            list[i] = new Expense1();

            System.out.print((i + 1) + "件目の項目: ");
            list[i].title = sc.nextLine();
            // nextLine() で項目を入力

            System.out.print((i + 1) + "件目の金額: ");
            list[i].amount = Integer.parseInt(sc.nextLine());
            // nextLine() で文字列として受け取り、数字に変換する
            // これで入力ズレが完全に防げる
        }

        // 入力内容を表示
        for (Expense1 e : list) {
            e.show();
        }

        // 合計を計算
        int sum = total(list);
        System.out.println("合計: " + sum + "円");

        sc.close();
    }

    static int total(Expense1[] list) {
        int sum = 0;

        for (Expense1 e : list) {
            sum += e.amount;
        }

        return sum;
    }
}