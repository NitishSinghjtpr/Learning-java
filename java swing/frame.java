import javax.swing.*;

public class frame {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Main Frame");
        //setSize height and width
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b1=new JButton("Click me");
        b1.setBounds(100,80,80,70);
        frame.add(b1);
        JLabel l1=new JLabel("click the button");
        l1.setBounds(100,40,100,30);
        frame.add(l1);
    }
    
}
