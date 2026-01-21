package 釣果;

public class FishRecord {
    String date;
    String fishName;
    String fishingRod;
    String tide;
    int size;
    int count;

    public FishRecord(String date, String fishName, String fisingRod, String tide, int size, int count) {
        this.date = date;
        this.fishName = fishName;
        this.fishingRod = fisingRod;
        this.tide = tide;
        this.size = size;
        this.count = count;
    }

    @Override
    public String toString() {
        return date + " / " + fishName + " / " + fishingRod + " / " + tide + " / " + size + "cm / " + count + "匹";
    }
}