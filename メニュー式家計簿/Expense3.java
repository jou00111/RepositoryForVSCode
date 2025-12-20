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

    public String toCSV() {
        return category + "," + title + "," + amount + "," + month;
    }

    // CSVから復元
    public static Expense3 fromCSV(String line) {
        String[] parts = line.split(",");
        String category = parts[0];
        String title = parts[1];
        int amount = Integer.parseInt(parts[2]);
        int month = Integer.parseInt(parts[3]);
        return new Expense3(category, title, amount, month);
    }
}