import java.util.Scanner;
import java.util.ArrayList;

public class ItMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// 入力を受け取る

        ArrayList<Item> list = new ArrayList<>();// データを入れる箱

        // 入力ループ
        while (true) {
            // 同じ行に入力してもらうためprintで表示
            System.out.print("商品名を入力してください。(終了で終わり) : ");
            String name = sc.nextLine();

            if (name.equals("終了")) {
                break; // 終了で入力終了
            }

            System.out.println("値段を入力してください。：");
            int price = Integer.parseInt(sc.nextLine());
            // nextLine() で受け取ってから数字に変換することで入力ズレを防ぐ

            // Item オブジェクトを作成して値をセット
            Item item = new Item();
            item.name = name;
            item.price = price;

            list.add(item);
        }
        System.out.println("\n---買い物リスト---");
        for (Item item : list) {
            item.show();
        }

        int sum = total(list);
        System.out.println("\n合計" + sum + "円");

        sc.close();

    }

    static int total(ArrayList<Item> list) {
        int sum = 0;
        for (Item item : list) {
            sum += item.price;
        }
        return sum;
    }
}
