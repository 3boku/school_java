package swingalk;

import javax.swing.*;

public class SelectFont extends JDialog {
    String[] name = {"굴림", "굴림체", "궁서", "나눔손글씨 붓", "휴먼고딕"};
    String[] style = {"보통", "기울임", "굵게", "굵은 기울임"};
    String[] size = {"8", "10", "12", "16", "20", "24", "28", "32"};

    JList fontName = new JList(name);
    JList fontStyle = new JList(style);
    JList fontSize = new JList(size);

    JLabel sample = new JLabel("AaBbYyZz 한글처리");

    JButton btnOK = new JButton("확인");
    JButton btnNO = new JButton("취소");
}
