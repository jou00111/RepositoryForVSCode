public class main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        Dog pochi = calc.createDog("ポチ", 3);
        Dog kotetsu = calc.createDog("小鉄", 10);

        pochi.introduce();
        kotetsu.introduce();
    }
}
