import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MyInfo extends JFrame implements ListSelectionListener, ActionListener{
    String[] year = {"2006", "2007"};
    Integer[] month = new Integer[12];
    String[] day = new String[31];

    JPanel p0;

    Font defaultFont = new Font("굴림", Font.BOLD, 40);

    JList<String> listYear = new JList<String>(year);
    JList<Integer> listMonth = new JList<Integer>(month);
    JList<String> listDay = new JList<String>(day);

    JRadioButton radio_male = new JRadioButton("남자");
    JRadioButton radio_female = new JRadioButton("여자");

    JLabel sample = new JLabel("20615 정현서");

    JButton btnOK = new JButton("확인");
    JButton btnNO = new JButton("취소");

    JCheckBox check_agree = new JCheckBox("개인정보 활용에 동의 하심?");

    private void 선생님_제공_기초화면() {
        setTitle("수행평가 연습");
        setBounds(0, 0, 450, 500);
        setTitle("수행평가 연습");

        p0 = new JPanel(null);
        add(p0);

        //월, 일 표현에는 스크롤이 필요합니다.
        JScrollPane scrollPane1 = new JScrollPane(listMonth);
        JScrollPane scrollPane2 = new JScrollPane(listDay);

        // 리스트
        listYear.setBounds(10, 30, 90, 160);
        scrollPane1.setBounds(120, 30, 90, 160);
        scrollPane2.setBounds(220, 30, 90, 160);

        //라디오 버튼 생성
        radio_male.setBounds(320, 30, 80, 50);
        radio_female.setBounds(320, 80, 80, 50);
        //radio_male.setFont(defaultFont);
        //radio_female.setFont(defaultFont);
        radio_male.setSelected(true);

        //라벨
        sample.setBounds(10, 180, 500, 50);
        //sample.setFont(defaultFont);

        //CheckBox
        check_agree.setBounds(10, 300, 500, 50);
        //check_agree.setFont(defaultFont);

        //버튼 2개
        btnOK.setBounds(100, 360, 80, 20);
        btnNO.setBounds(200, 360, 80, 20);
        //모든 항목 패널에 더하기

        p0.add(listYear);
        p0.add(scrollPane1);
        p0.add(scrollPane2);
        p0.add(radio_male);
        p0.add(radio_female);
        p0.add(sample);
        p0.add(check_agree);
        p0.add(btnOK);
        p0.add(btnNO);


        //화면이 열리면 첫 항목 강제 선택
        listYear.setSelectedIndex(0);
        listMonth.setSelectedIndex(0);
        listDay.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        new MyInfo();
    }

    MyInfo(){
        for (int i=0;i<12;i++)
            month[i] = i+1;
        for (int i=0;i<31;i++)
            day[i] = Integer.toString(i+1);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radio_male);
        buttonGroup.add(radio_female);

        선생님_제공_기초화면();

        listYear.addListSelectionListener(this);
        listMonth.addListSelectionListener(this);
        listDay.addListSelectionListener(this);

        btnOK.addActionListener(this);
        btnNO.addActionListener(this);
        radio_male.addActionListener(this);
        radio_female.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        changeSample();

        if(e.getSource() == btnOK){
            if(check_agree.isSelected()==false){
                JOptionPane.showMessageDialog(null, "개인정보 제공에 동의 해라.");
            }
            else {
                JOptionPane.showMessageDialog(null, "ㄱㅅ.");
                dispose();
            }
        }
        else if(e.getSource() == btnNO){
            dispose();
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        changeSample();
    }

    private void changeSample() {
        String y = listYear.getSelectedValue();
        Integer m = listMonth.getSelectedValue();
        String d = listDay.getSelectedValue();

        String info = " 생년월일 "+y+"년 "+m+"월 "+d+"일";

        if(radio_male.isSelected()){
            info = "성별: 남자"+info;
        }
        else if(radio_female.isSelected()){
            info = "성별: 여자"+info;
        }

        sample.setText(info);
    }
}