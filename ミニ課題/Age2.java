import java.util.Scanner;

public class Age2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);// Scannerクラスのインスタンスを作成
        System.out.print("年齢を入力してください→");
        int age = a.nextInt(); // 整数の入力を受け取る

        // 年齢が20歳より大きいかどうかを判定

        if (age > 20) {
            System.out.println("大人です");
        } else {
            System.out.println("子供です");
        }
        a.close();
    }
}
