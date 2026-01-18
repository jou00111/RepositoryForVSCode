package 釣果;

public class FishRecord {
    String date;
    String fishName;
    int size;
    int count;

    public FishRecord(String date, String fishName, int size, int count) {
        this.date = date;
        this.fishName = fishName;
        this.size = size;
        this.count = count;
    }

    @Override
    public String toString() {
        return date + " / " + fishName + " / " + size + "cm / " + count + "匹";
    }
}