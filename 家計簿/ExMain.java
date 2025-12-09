public class ExMain {
    public static void main(String[] args) {
        Expense e1 = new Expense();
        e1.title = "食費";
        e1.amount = 1200;

        Expense e2 = new Expense();
        e2.title = "交通費";
        e2.amount = 30000;

        Expense e3 = new Expense();
        e3.title = "光熱費";
        e3.amount = 6000;

        Expense[] list = { e1, e2, e3 };

        for (Expense e : list) {
            e.show();
        }

        int sum = total(list);
        System.out.println("合計:" + sum + "円");

    }

    static int total(Expense[] list) {
        int sum = 0;
        for (Expense e : list) {
            sum += e.amount;
        }
        return sum;
    }

}
