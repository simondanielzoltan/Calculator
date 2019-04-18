import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class JJFrame extends javax.swing.JFrame {


    public JJFrame() throws HeadlessException {



        JButton button = new JButton("Na fogadjunk nem bírod elolvasni!");
        JTextField jTextField = new JTextField(10);
        JTextField jTextField2 = new JTextField(10);
        JRadioButton radio = new JRadioButton("+");
        JRadioButton radio2 = new JRadioButton("-");
        JRadioButton radio3 = new JRadioButton("/");
        JRadioButton radio4 = new JRadioButton("*");
        ButtonGroup group = new ButtonGroup();
        JLabel label =new JLabel();

        jTextField.setBounds(510,10,100,50);
        jTextField2.setBounds(10,10, 100, 50);
        button.setBounds(250,250, 400, 100);
        radio.setBounds(250,10,50,50);
        radio2.setBounds(250,60,50,50);
        radio3.setBounds(250,110,50,50);
        radio4.setBounds(250,170,50,50);


         button.addActionListener(e -> {
             String str="cica";
             int num2=Integer.parseInt(jTextField.getText());
             int num=Integer.parseInt(jTextField2.getText());
             int result=0;

             if(radio.isSelected()){
                 str="+";
             }
             if(radio2.isSelected()){
                 str="-";
             }
             if(radio3.isSelected()){
                 str="/";
             }
             if(radio4.isSelected()){
                 str="*";
             }

             if(str.equals("+")){
                 result=num+num2;
             }
             if(str.equals("-")){
                 result=num-num2;
             }
             if(str.equals("*")){
                 result=num*num2;
             }
             if(str.equals("/")){
                 result=num/num2;
             }


             label.setText(Integer.toString(result));
             label.setBounds(500,500,100,110);

             this.add(label);
             this.repaint();




         });







        group.add(radio);
        group.add(radio2);
        group.add(radio3);
        group.add(radio4);

        this.add(button);
        this.add(jTextField);
        this.add(jTextField2);
        this.add(radio);
        this.add(radio2);
        this.add(radio3);
        this.add(radio4);


        this.setSize(1024, 768);
        this.setLayout(null);
        this.setVisible(true);

    }



}
