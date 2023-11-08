package test_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SwingCounter extends JFrame implements ActionListener {
    JPanel p = new JPanel();
    JLabel labelNumber = new JLabel("10");
    JButton btnInc = new JButton("증가");
    JButton btnDec = new JButton("감소");
    JButton btnCls = new JButton("초기화");
    JButton btnStart = new JButton("카운트다운");
    public static void main(String[] args) {
        new SwingCounter();
    }

    SwingCounter(){
        p.add(btnInc);
        p.add(btnDec);
        p.add(btnStart);
        p.add(btnCls);
        p.add(labelNumber);
        add(p);

        setTitle("test");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        p.setBackground(Color.yellow);

        btnInc.addActionListener(this);
        btnDec.addActionListener(this);
        btnStart.addActionListener(this);
        btnCls.addActionListener(this);

        labelNumber.setFont(new Font("굴림", Font.BOLD, 50));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str;

        if (e.getSource() == btnInc) {
            str = labelNumber.getText();

            int counter = Integer.parseInt(str) + 1;

            labelNumber.setText(counter + "");
        } else if (e.getSource() == btnDec) {
            str = labelNumber.getText();

            int counter = Integer.parseInt(str) - 1;
            if(counter >= 0)
                labelNumber.setText(counter + "");
        } else if (e.getSource() == btnCls) {
            labelNumber.setText("10");
            btnStart.setEnabled(true);
        } else if (e.getSource() == btnStart) {
            CountDownTimer X = new CountDownTimer(labelNumber);
            Thread t = new Thread(X);
            t.start();

            btnStart.setEnabled(false);

        }
    }
}


