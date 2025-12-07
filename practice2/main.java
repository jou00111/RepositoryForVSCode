public class main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("足し算: " + calc.add(10, 5));
        System.out.println("引き算: " + calc.subtract(10, 5));
        System.out.println("かけ算: " + calc.multiply(10, 5));
        System.out.println("割り算: " + calc.devide(10, 5));
    }
}
