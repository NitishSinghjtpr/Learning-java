

import javax.swing.*;

public class radioButton {
    public static void main(String[] args) {
          JFrame frame=new JFrame("Main Frame");
        //setSize height and width
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JRadioButton rb=new JRadioButton("java");
        rb.setBounds(50,80,80,30);
        frame.add(rb);
    }
}
