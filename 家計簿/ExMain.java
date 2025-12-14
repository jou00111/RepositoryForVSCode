public class ExMain {
    public static void main(String[] args) {
        Expense2 e1 = new Expense2();
        e1.title = "食費";
        e1.amount = 1200;

        Expense2 e2 = new Expense2();
        e2.title = "交通費";
        e2.amount = 30000;

        Expense2 e3 = new Expense2();
        e3.title = "光熱費";
        e3.amount = 6000;

        Expense2[] list = { e1, e2, e3 };

        for (Expense2 e : list) {
            e.show();
        }

        int sum = total(list);
        System.out.println("合計:" + sum + "円");

    }

    static int total(Expense2[] list) {
        int sum = 0;
        for (Expense2 e : list) {
            sum += e.amount;
        }
        return sum;
    }

}
