package return1;

public class RecMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.width = 20;
        r.height = 50;

        int result = r.area();

        System.out.println("面積は" + result);
    }
}
