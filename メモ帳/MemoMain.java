import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MemoMain {
    public static void main(String[] args) {

        // メモを保存するリスト
        ArrayList<String> memoList = new ArrayList<>();

        // ----------------------------------
        // ウインドウの設定
        // ----------------------------------
        JFrame frame = new JFrame("メモ帳アプリ");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // ----------------------------------
        // 上部パネル(入力欄+ボタン)
        // -------------------------------
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());

        // めも入力欄
        JTextField memoField = new JTextField(20);

        // 追加ボタン
        JButton addButton = new JButton("追加");

        // パネルに追加
        topPanel.add(memoField);
        topPanel.add(addButton);

        // ----------------------------------
        // 下部(メモ一覧表示)
        // ----------------------------------
        JTextArea memoArea = new JTextArea();
        memoArea.setEditable(false); // 編集不可に設定
        JScrollPane scroll = new JScrollPane(memoArea);

        // ----------------------------------
        // 追加ボタンの処理
        // ----------------------------------
        addButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String text = memoField.getText();
                if (text.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "メモを入力してください");
                    return;
                }

                // リストに追加
                memoList.add(text);
                // 表示更新
                memoArea.append(text + "\n");
                // 入力欄をクリア
                memoField.setText("");
            }
        });

        // --------------------------------
        // ウインドウに部品を追加
        // -------------------------------
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(scroll, BorderLayout.CENTER);

        // -------------------------------
        // 表示
        // -------------------------------
        frame.setVisible(true);
    }
}