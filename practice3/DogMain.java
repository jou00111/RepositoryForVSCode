public class DogMain {
    public static void main(String[] args) {

        DogCalculator calc = new DogCalculator();

        Dog pochi = calc.createDog("ポチ", 3);
        Dog kotetsu = calc.createDog("小鉄", 10);

        pochi.introduce();
        kotetsu.introduce();
    }
}
