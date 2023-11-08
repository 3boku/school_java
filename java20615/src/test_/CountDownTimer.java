package test_;

import javax.swing.*;

public class CountDownTimer implements Runnable{

    JLabel labelNumber;
    CountDownTimer(JLabel labelNumber) {
        this.labelNumber = labelNumber;
    }

    @Override
    public void run() {
        while (true) {
            String str = labelNumber.getText();

            int count = Integer.parseInt(str) - 1;

            if(count >= 0)
                labelNumber.setText(count + "");
            else
                break;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
