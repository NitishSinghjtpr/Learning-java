import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class jtext {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Main Frame");
        //setSize height and width
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField t1=new JTextField("typing...");
        t1.setBounds(100,100,100,30);
        frame.add(t1);
        JPasswordField p1=new JPasswordField("password");
        p1.setBounds(100,130,100,30);
        frame.add(p1);

    }
    
}
