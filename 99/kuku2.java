public class Kuku2 {
    public static void main(String[] args) {
        for (int dan = 1; dan <= 9; dan++) { // １～9の段のループ
            for (int i = 1; i <= 9; i++) { // 各段の1～9の掛け算
                System.out.println(dan + "x" + i + "=" + (dan * i));
            }
            System.out.println(); // 段ごとに空行
        }
    }
}