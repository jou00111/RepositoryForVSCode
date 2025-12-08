import java.util.Scanner;
//コンソール入力受付

public class HelloWorld2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("あなたの名前を入力してください: ");
        String name = sc.nextLine();
        System.out.println("こんにちは、" + name + "さん!");
        sc.close();

    }
}