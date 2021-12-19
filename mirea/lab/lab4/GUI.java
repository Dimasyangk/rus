package ru.mirea.lab.lab4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame{
    private JFrame frame = new JFrame("Match!");
    private JButton button1 = new JButton("AC Millan");
    private JButton button2 = new JButton("Real Madrid");
    private JButton button3 = new JButton("End Match");
    private JButton button4 = new JButton("New Match");
    private JLabel label1 = new JLabel("Result: 0X0");
    private JLabel label2 = new JLabel("Last scorer: N/A");
    private JLabel label3 = new JLabel("Winner: none");
    public int click_but1 = 0;
    public int click_but2 = 0;


    public GUI() {
        super("Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(555, 455);
        button1.setBounds(25, 15, 200, 50);
        button1.setActionCommand("Millan");
        button2.setBounds(250, 15, 200, 50);
        button2.setActionCommand("Madrid");
        button3.setBounds(25, 120, 200, 50);
        button3.setActionCommand("End");
        button4.setBounds(250, 120, 200, 50);
        button4.setActionCommand("Reset");
        label1.setBounds(25, 280, 150, 20);
        label2.setBounds(25, 300, 150, 20);
        label3.setBounds(25, 320, 150, 20);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(label1);
        add(label2);
        add(label3);
        ActionListener actionListener = new TestActionListener();

        button1.addActionListener(actionListener);
        button2.addActionListener(actionListener);
        button3.addActionListener(actionListener);
        button4.addActionListener(actionListener);
    }

        public class TestActionListener implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                String butText = e.getActionCommand();
                switch(butText){
                    case "Millan":
                        click_but1++;
                        label1.setText("Result: " + click_but1 + "X" + click_but2);
                        label2.setText("Last scorer: " + butText);
                        if (click_but1 > click_but2){
                            label3.setText("Winner: " + butText);
                        } else if (click_but2 == click_but1){
                            label3.setText("Winner: none");
                        }
                        break;
                    case "Madrid":
                        click_but2++;
                        label1.setText("Result: " + click_but1 + "X" + click_but2);
                        label2.setText("Last scorer: " + butText);
                        if (click_but2 > click_but1){
                            label3.setText("Winner: " + butText);
                        } else if (click_but2 == click_but1){
                            label3.setText("Winner: none");
                        }
                        break;
                    case "Reset":
                        click_but1 = 0; click_but2 = 0;
                        label1.setText("Result: " + click_but1 + "X" + click_but2);
                        label2.setText("Last scorer: N/A");
                        label3.setText("Winner: none");
                        break;
                    case "End":
                        if (click_but1 > click_but2){
                            JOptionPane.showMessageDialog(null, "Winner in this match is AC Millan!!!", "Result", JOptionPane.INFORMATION_MESSAGE);
                        } else if (click_but2 > click_but1){
                            JOptionPane.showMessageDialog(null, "Winner in this match is Real Madrid!!!", "Result", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "The match ended in a draw", "Result", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                }
            }
    }
    public static void main(String[] args){
        new GUI().setVisible(true);
    }
}