package 釣果;

import java.util.*;

public class FishApp {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        ArrayList<FishRecord> Records = new ArrayList<>();

        while (true) {
            System.out.println("===釣果アプリ===");
            System.out.println("1.釣果を登録する");
            System.out.println("2.釣果一覧を表示する");
            System.out.println("0.終了する");
            System.out.print("番号を選択してください:");

            int choice = a.nextInt();
            a.nextLine();
            if (choice == 0) {
                System.out.println("終了します。");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("日付→");
                    String date = a.nextLine();

                    System.out.print("魚の名称→");
                    String FishName = a.nextLine();

                    System.out.println("使用した釣り竿");
                    String fishingRod = a.nextLine();

                    System.out.println("潮汐");
                    String tide = a.nextLine();

                    System.out.print("サイズ");
                    int size = a.nextInt();

                    System.out.print("匹数");
                    int count = a.nextInt();
                    a.nextLine();

                    Records.add(new FishRecord(date, FishName, fishingRod, tide, size, count));

                    System.out.println("釣果を登録しました！");
                    break;

                case 2:
                    for (FishRecord b : Records) {
                        System.out
                                .println(b.date + "/" + b.fishName + "/" + b.fishingRod + "/" + b.tide + "/" + b.size
                                        + "/" + b.count);
                    }
                    break;
                default:
                    System.out.println("無効な入力です");
            }
        }
        a.close();
    }
}
