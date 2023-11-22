package swingalk;

import javax.swing.*;
import java.awt.*;

public class Chat extends JFrame {
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem[] = new JMenuItem[4];
    String[] menuTitle = {"이름 변경", "배경 변경", "폰트 변경", "서버주소변경"};

    JPanel jp_top, jp_bottom;
    JScrollPane jp_chat;

    String userId;
    JLabel userLabel;



    public Chat(String userId) {
        jp_top = new JPanel();
        jp_chat = new JScrollPane();
        jp_bottom = new JPanel();

        jp_top.setBounds(0, 0, 300, 40);
        jp_chat.setBounds(0, 40, 300, 440);
        jp_bottom.setBounds(0, 480, 300, 80);

        jp_top.setBackground(Color.yellow);
        jp_chat.setBackground(Color.pink);
        jp_bottom.setBackground(Color.gray);

        add(jp_top);
        add(jp_chat);
        add(jp_bottom);

        this.userId = userId;

        setSize(320, 620);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        createChat();

        setVisible(true);
    }

    private void createChat() {
        menuBar = new JMenuBar();
        menu = new JMenu("설정");
        menuBar.add(menu);

        menuItem = new JMenuItem[4];

        for (int i = 0; i < menuItem.length; i++) {
            menuItem[i] = new JMenuItem(menuTitle[i]);
            menu.add(menuItem[i]);
        }

        setJMenuBar(menuBar);
    }
}
