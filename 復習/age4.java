import java.util.*;

class age4 {
    public static void main(String[] args) {
        System.out.print("年齢を入力してください→");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 20) {
            System.out.println("大人です。");
        } else {
            System.out.println("子供です。");
        }
        sc.close();
    }
}