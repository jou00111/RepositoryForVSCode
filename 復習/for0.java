class for0 {
    public static void main(String[] args) {
        // 1から100までの偶数を表示
        for (int i = 1; i <= 100; i++) {
            // 偶数の判定%は剰余演算子
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
