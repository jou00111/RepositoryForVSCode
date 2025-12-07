class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int devide(int a, int b) {
        if (b == 0) {
            System.out.println("エラー: 0で割ることはできません");
            return 0; // 仮の値
        }
        return a / b;
    }
}
