import javax.swing.*;

public class checkBox {
   
       public static void main(String[] args) {
        JFrame frame=new JFrame("Main Frame");
        //setSize height and width
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox cb=new JCheckBox("java");
        cb.setBounds(50,30,60,30);
        frame.add(cb);

        JCheckBox cb2=new JCheckBox("c++");
        cb2.setBounds(50,60,60,30);
        frame.add(cb2);

        JCheckBox cb3=new JCheckBox("python");
        cb3.setBounds(50,90,90,30);
        frame.add(cb3);
       }
        
    
}
