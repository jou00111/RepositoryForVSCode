package 釣果アプリ;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FishAppGUI {
    // 釣果を保存するリスト
    static ArrayList<FishRecord> records = new ArrayList<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("釣果アプリ");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // パネル(画面の中に部品を置く場所)
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2)); // 5行2列のレイアウト

        // 入力欄
        JTextField dateField = new JTextField();
        JTextField fishNameField = new JTextField();
        JTextField sizeField = new JTextField();
        JTextField countField = new JTextField();

        // ラベル+入力欄をパネルに追加
        panel.add(new JLabel("日付:"));
        panel.add(dateField);

        panel.add(new JLabel("魚の名前:"));
        panel.add(fishNameField);

        panel.add(new JLabel("サイズ(cm):"));
        panel.add(sizeField);
        panel.add(new JLabel("数:"));
        panel.add(countField);

        // 登録ボタン
        JButton addButton = new JButton("登録");
        panel.add(addButton);

        // 空白(レイアウト調整)
        panel.add(new JLabel(""));
        frame.add(panel);

        // パネルをフレームに調整

        frame.add(panel);
        frame.setVisible(true);

    }
}
