public class Expense3 {
    String category;
    String title;
    int amount;
    int month; // ← 追加！

    public Expense3(String category, String title, int amount, int month) {
        this.category = category;
        this.title = title;
        this.amount = amount;
        this.month = month;
    }
}