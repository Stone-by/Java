package Stoneby;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends Calcul{
    private JButton a1, a2, a3, a4, a5, a6, a7, a8, a9,a0;
    private JButton plus, minus, rovno;
    private JPanel[] plan;
    private JFrame frame;
    private JLabel raz,dva,tri,znak;
    private String a="",b="";
    private char c=' ';
    private int chet=0;
    private String rezul="";
    public Frame(){
        Calcul cal = new Calcul();
        frame = new JFrame("Калькулятор");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        plan = new JPanel[2];
        frame.setLayout(new GridLayout(1,2));
        for(int i=0;i<plan.length;i++){
            plan[i]=new JPanel();
        }
        plan[0].setLayout(new GridLayout(4,4));
        plan[1].setLayout(new GridLayout(4,1));
        a1 = new JButton("1");
        a2 = new JButton("2");
        a3 = new JButton("3");
        a4 = new JButton("4");
        a5 = new JButton("5");
        a6 = new JButton("6");
        a7 = new JButton("7");
        a8 = new JButton("8");
        a9 = new JButton("9");
        a0 = new JButton("0");
        plus = new JButton("+");
        minus = new JButton("-");
        rovno = new JButton("=");
        raz = new JLabel("  Первое число: ");
        dva = new JLabel("  Второе число: ");
        tri = new JLabel("  Результат: ");
        znak = new JLabel("  Знак: ");
        a1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(chet==0){
                    a+="1";
                    raz.setText("  Первое число: "+a);
                }
                if(chet==1){
                    b+="1";
                    dva.setText("  Второе число: "+b);
                }

            }
        });
        a2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(chet==0){
                    a+="2";
                    raz.setText("  Первое число: "+a);
                }
                if(chet==1){
                    b+="2";
                    dva.setText("  Второе число: "+b);
                }
            }
        });
        a3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(chet==0){
                    a+="3";
                    raz.setText("  Первое число: "+a);
                }
                if(chet==1){
                    b+="3";
                    dva.setText("  Второе число: "+b);
                }
            }
        });
        a4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(chet==0){
                    a+="4";
                    raz.setText("  Первое число: "+a);
                }
                if(chet==1){
                    b+="4";
                    dva.setText("  Второе число: "+b);
                }
            }
        });
        a5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(chet==0){
                    a+="5";
                    raz.setText("  Первое число: "+a);
                }
                if(chet==1){
                    b+="5";
                    dva.setText("  Второе число: "+b);
                }
            }
        });
        a6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(chet==0){
                    a+="6";
                    raz.setText("  Первое число: "+a);
                }
                if(chet==1){
                    b+="6";
                    dva.setText("  Второе число: "+b);
                }
            }
        });
        a7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(chet==0){
                    a+="7";
                    raz.setText("  Первое число: "+a);
                }
                if(chet==1){
                    b+="7";
                    dva.setText("  Второе число: "+b);
                }
            }
        });
        a8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(chet==0){
                    a+="8";
                    raz.setText("  Первое число: "+a);
                }
                if(chet==1){
                    b+="8";
                    dva.setText("  Второе число: "+b);
                }
            }
        });
        a9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(chet==0){
                    a+="9";
                    raz.setText("  Первое число: "+a);
                }
                if(chet==1){
                    b+="9";
                    dva.setText("  Второе число: "+b);
                }
            }
        });
        a0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(chet==0){
                    a+="0";
                    raz.setText("  Первое число: "+a);
                }
                if(chet==1){
                    b+="0";
                    dva.setText("  Второе число: "+b);
                }
            }
        });
        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(chet==0){
                    cal.setA(Integer.valueOf(a));
                    chet++;
                    c='+';
                    znak.setText("  Знак: "+c);
                }
            }
        });
        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(chet==0){
                    cal.setA(Integer.valueOf(a));
                    chet++;
                    c='-';
                    znak.setText("  Знак: "+c);
                }
            }
        });
        rovno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cal.setB(Integer.valueOf(b));
                cal.setC(c);
                if(chet==1){
                    rezul = cal.Chet();
                    tri.setText("  Результат: "+rezul);
                    a="";
                    b="";
                }
                if(chet!=1){
                    chet=0;
                    JOptionPane.showMessageDialog(null, "Error!");
                }
                chet=0;
            }
        });
        plan[0].add(a1);
        plan[0].add(a2);
        plan[0].add(a3);
        plan[0].add(a4);
        plan[0].add(a5);
        plan[0].add(a6);
        plan[0].add(a7);
        plan[0].add(a8);
        plan[0].add(a9);
        plan[0].add(a0);
        plan[0].add(plus);
        plan[0].add(minus);
        plan[0].add(rovno);
        plan[1].add(raz);
        plan[1].add(znak);
        plan[1].add(dva);
        plan[1].add(tri);
        for(int i=0;i<plan.length;i++){
            frame.add(plan[i]);
        }
    }
}
