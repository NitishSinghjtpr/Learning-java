import javax.swing.*;

public class combobox {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Main Frame");
        //setSize height and width
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String data[]={"java","c++","python","html","css","js"};
        JComboBox cb5=new JComboBox(data);
        cb5.setBounds(50,180,100,30);
        frame.add(cb5);
    }
}
