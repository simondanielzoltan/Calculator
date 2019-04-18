import javax.swing.*;
import java.awt.*;

public class Calc extends javax.swing.JFrame {

    double result;
    String operator="null";




    JButton sumButton = new JButton("+");
    JButton negButton = new JButton("-");
    JButton perButton = new JButton("/");
    JButton starButton = new JButton("*");
    JButton eqButton = new JButton("=");
    JButton commaButton = new JButton(",");
    JButton persButton = new JButton("%");
    JButton cButton = new JButton("C");
    JButton delButton = new JButton("<");
    JButton nullButton = new JButton("0");
    JButton oneButton = new JButton("1");
    JButton twoButton = new JButton("2");
    JButton threeButton = new JButton("3");
    JButton fourButton = new JButton("4");
    JButton fiveButton = new JButton("5");
    JButton sixButton = new JButton("6");
    JButton sevenButton = new JButton("7");
    JButton eightButton = new JButton("8");
    JButton nineButton = new JButton("9");
    JTextField textField = new JTextField(10);


    public Calc() throws HeadlessException {


        textField.setBounds(0,0,200,50);
        sumButton.setBounds(150,50,50,50);
        negButton.setBounds(150,100,50,50);
        perButton.setBounds(150,150,50,50);
        starButton.setBounds(150,200,50,50);
        eqButton.setBounds(150,250,50,50);
        commaButton.setBounds(100,250,50,50);
        persButton.setBounds(50,50,50,50);
        cButton.setBounds(0,50,50,50);
        delButton.setBounds(100,50,50,50);
        nullButton.setBounds(0,250,100,50);
        oneButton.setBounds(0,200,50,50);
        twoButton.setBounds(50,200,50,50);
        threeButton.setBounds(100,200,50,50);
        fourButton.setBounds(0,150,50,50);
        fiveButton.setBounds(50,150,50,50);
        sixButton.setBounds(100,150,50,50);
        sevenButton.setBounds(0,100,50,50);
        eightButton.setBounds(50,100,50,50);
        nineButton.setBounds(100,100,50,50);

        this.add(textField);
        this.add(sumButton);
        this.add(negButton);
        this.add(perButton);
        this.add(starButton);
        this.add(eqButton);
        this.add(commaButton);
        this.add(persButton);
        this.add(cButton);
        this.add(delButton);
        this.add(nullButton);
        this.add(oneButton);
        this.add(twoButton);
        this.add(threeButton);
        this.add(fourButton);
        this.add(fiveButton);
        this.add(sixButton);
        this.add(sevenButton);
        this.add(eightButton);
        this.add(nineButton);

        this.setSize(200, 330);
        this.setLayout(null);
        this.setVisible(true);





        sumButton.addActionListener(e -> {
            if(!this.operator.equals("null")){
                equals(operator);
            }else {
                this.result = Double.parseDouble(textField.getText());
            }
            this.operator = "+";
            textField.setText("");



        });

        negButton.addActionListener(e -> {
            if(!this.operator.equals("null")){
                equals(operator);
            }else {
                this.result = Double.parseDouble(textField.getText());
            }
            this.operator = "-";
            textField.setText("");

        });

        perButton.addActionListener(e -> {
            if(!this.operator.equals("null")){
                equals(operator);

            }else {
                this.result = Double.parseDouble(textField.getText());
            }

            this.operator = "/";
            textField.setText("");
        });

        starButton.addActionListener(e -> {
            if(!this.operator.equals("null")){
                equals(operator);

            }else {
                this.result = Double.parseDouble(textField.getText());
            }
            this.operator = "*";
            textField.setText("");
        });

        eqButton.addActionListener(e -> {
            if(operator.equals("+")){
                this.result=this.result+Double.parseDouble(textField.getText());
            }
            if(operator.equals("-")){
                this.result=this.result-Double.parseDouble(textField.getText());
            }
            if(operator.equals("/")){
                this.result=this.result/Double.parseDouble(textField.getText());
            }
            if(operator.equals("*")){
                this.result=this.result*Double.parseDouble(textField.getText());
            }

            textField.setText(Double.toString(result));
            this.operator="null";
            this.result=0;

        });

        cButton.addActionListener(e -> {
            this.operator="null";
            this.result=0;

            textField.setText("");
        });




        nullButton.addActionListener(e -> {
            textField.setText(textField.getText()+"0");
        });

        oneButton.addActionListener(e -> {
            textField.setText(textField.getText()+"1");
        });

        twoButton.addActionListener(e -> {
            textField.setText(textField.getText()+"2");
        });

        threeButton.addActionListener(e -> {
            textField.setText(textField.getText()+"3");
        });

        fourButton.addActionListener(e -> {
            textField.setText(textField.getText()+"4");
        });

        fiveButton.addActionListener(e -> {
            textField.setText(textField.getText()+"5");
        });

        sixButton.addActionListener(e -> {
            textField.setText(textField.getText()+"6");
        });

        sevenButton.addActionListener(e -> {
            textField.setText(textField.getText()+"7");
        });

        eightButton.addActionListener(e -> {
            textField.setText(textField.getText()+"8");
        });

        nineButton.addActionListener(e -> {
            textField.setText(textField.getText()+"9");
        });

        commaButton.addActionListener(e -> {
            if(!operator.equals(".")) {
                textField.setText(textField.getText() + ".");
                operator = ".";
            }
        });

        delButton.addActionListener(e -> {
            if(!textField.getText().equals("")){
                String str=textField.getText();
                textField.setText(str.substring(0, str.length() - 1));
            }
        });



    }


    private void equals(String operator){
        if(operator.equals("+")){
            this.result =this.result +Double.valueOf(textField.getText());
        }
        if(operator.equals("-")){
            this.result =this.result -Double.parseDouble(textField.getText());
        }
        if(operator.equals("/")){
            this.result =this.result /Double.parseDouble(textField.getText());
        }
        if(operator.equals("*")){
            this.result =this.result *Double.parseDouble(textField.getText());
        }
    }
}
