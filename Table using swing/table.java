import javax.swing.*;
public class table {
     public static void main(String[] args) {
        JFrame frame=new JFrame("Main Frame");
        //setSize height and width
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String columns[]={"id","Name","Salary"};
        String data[][]={{"101","Nitish","80,000"},{"102","sonu","70,000"},{"103","Amol","50,000"}};
        JTable tb1=new JTable(data,columns);
        tb1.setBounds(100,100,300,50);
        frame.add(tb1);

     }
}
