public class KukuTable {
    public static void main(String[] args) {
        for (int dan = 1; dan <= 9; dan++) {
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d×%d=%-3d ", dan, i, dan * i);// %-3dで3桁分のスペースを確保し、左寄せで表示
            }
            System.out.println();
        }
    }
}