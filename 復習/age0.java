import java.util.*;

class age0 {
    public static void main(String[] args) {
        System.out.print("年齢を入力してください→");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("あなたは" + age + "歳です。");

        sc.close();
    }
}