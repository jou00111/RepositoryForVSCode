public class Main3 {
    public static void main(String[] args) {
        Dog pochi = new Dog();
        pochi.name = "ポチ";
        pochi.age = 3;

        pochi.introduce();

        Dog2 kotetsu = new Dog2();
        kotetsu.name = "小鉄";
        kotetsu.age = 10;

        kotetsu.introduce();
    }
}
