import java.util.Scanner;

public class ScMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Expense1 e1 = new Expense1();

        System.out.println("項目を入力してください");
        e1.title = sc.nextLine();

        System.out.println("金額を入力してください");
        e1.amount = sc.nextInt();

        e1.show();

        sc.close();
    }
}
