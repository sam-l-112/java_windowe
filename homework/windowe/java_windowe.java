package homework.windowe;

import javax.swing.*;
import java.awt.BorderLayout;

public class java_windowe {

    public java_windowe() {
        JFrame jframe = new JFrame();
        jframe.setSize(600,500);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button1 = new JButton("按鈕1");
        JButton button2 = new JButton("按鈕2");
        JButton button3 = new JButton("按鈕3");
        JTextArea textArea = new JTextArea("文字區域");

        jframe.getContentPane().add(button1, BorderLayout.EAST);
        jframe.getContentPane().add(button2, BorderLayout.WEST);
        jframe.getContentPane().add(button3, BorderLayout.SOUTH);
        jframe.getContentPane().add(textArea, BorderLayout.CENTER);
        jframe.setVisible(true);
    
    }

    public static void main(String[] args) {
        new java_windowe();
        System.out.println("Hello World from java_windowe! 2025.10/18");
    }
}
