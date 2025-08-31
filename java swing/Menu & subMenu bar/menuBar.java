import javax.swing.*;

public class menuBar {

    public static void main(String[] args) {
        JFrame frame=new JFrame("Main Frame");
        //setSize height and width
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar mb=new JMenuBar();
        JMenu menue,submenu;
        JMenuItem i1,i2,i3,i4,i5;
        menue =new JMenu("Menu");
        submenu=new JMenu("subMenu");
        i1=new JMenuItem("Item i1");
        i2=new JMenuItem("Item i2");
        i3=new JMenuItem("Item i3");
        i4=new JMenuItem("Item i4");
        i5=new JMenuItem("Item i5");

        menue.add(i1);
        menue.add(i2);
        menue.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menue.add(submenu);
        mb.add(menue);
        frame.setJMenuBar(mb);

    }
}
