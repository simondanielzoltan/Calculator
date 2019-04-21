import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Calc extends javax.swing.JFrame {

    double result;
    String operator="null";


    JButton sumButton = new JButton("+");
    JButton subtractionButton = new JButton("-");
    JButton divisionButton = new JButton("/");
    JButton multiplicationButton = new JButton("*");
    JButton equalsButton = new JButton("=");
    JButton commaButton = new JButton(",");
    JButton percentageButton = new JButton("%");
    JButton cButton = new JButton("C");
    JButton deleteButton = new JButton("<");
    JButton zeroButton = new JButton("0");
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
        subtractionButton.setBounds(150,100,50,50);
        divisionButton.setBounds(150,150,50,50);
        multiplicationButton.setBounds(150,200,50,50);
        equalsButton.setBounds(150,250,50,50);
        commaButton.setBounds(100,250,50,50);
        percentageButton.setBounds(50,50,50,50);
        cButton.setBounds(0,50,50,50);
        deleteButton.setBounds(100,50,50,50);
        zeroButton.setBounds(0,250,100,50);
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
        this.add(subtractionButton);
        this.add(divisionButton);
        this.add(multiplicationButton);
        this.add(equalsButton);
        this.add(commaButton);
        this.add(percentageButton);
        this.add(cButton);
        this.add(deleteButton);
        this.add(zeroButton);
        this.add(oneButton);
        this.add(twoButton);
        this.add(threeButton);
        this.add(fourButton);
        this.add(fiveButton);
        this.add(sixButton);
        this.add(sevenButton);
        this.add(eightButton);
        this.add(nineButton);

        equalsButton.setBackground(Color.cyan);
        equalsButton.setForeground(Color.black);
        equalsButton.setBorder(new LineBorder(Color.black, 1));
        cButton.setBackground(Color.red);
        cButton.setForeground(Color.white);
        cButton.setBorder(new LineBorder(Color.black, 1));
        percentageButton.setBackground(Color.darkGray);
        percentageButton.setForeground(Color.white);
        percentageButton.setBorder(new LineBorder(Color.black, 1));
        deleteButton.setBackground(Color.darkGray);
        deleteButton.setForeground(Color.white);
        deleteButton.setBorder(new LineBorder(Color.black, 1));
        subtractionButton.setBackground(Color.darkGray);
        subtractionButton.setForeground(Color.white);
        subtractionButton.setBorder(new LineBorder(Color.black, 1));
        sumButton.setBackground(Color.darkGray);
        sumButton.setForeground(Color.white);
        sumButton.setBorder(new LineBorder(Color.black, 1));
        divisionButton.setBackground(Color.darkGray);
        divisionButton.setForeground(Color.white);
        divisionButton.setBorder(new LineBorder(Color.black, 1));
        multiplicationButton.setBackground(Color.darkGray);
        multiplicationButton.setForeground(Color.white);
        multiplicationButton.setBorder(new LineBorder(Color.black, 1));
        textField.setBorder(new LineBorder(Color.black, 1));



        this.setSize(200, 330);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        this.setLayout(null);
        this.setVisible(true);
        setTitle("Calculator");


        sumButton.addActionListener(e -> {
            setOperation("+");
        });

        subtractionButton.addActionListener(e -> {
            setOperation("-");
        });

        divisionButton.addActionListener(e -> {
            setOperation("/");
        });

        multiplicationButton.addActionListener(e -> {
            setOperation("*");
        });

        equalsButton.addActionListener(e -> {
            equals(operator);
            if(result % 1 == 0){
                textField.setText(Integer.toString((int)result));
            } else {
                textField.setText(Double.toString(result));
            }
            this.operator = "null";
            this.result = 0;
        });

        percentageButton.addActionListener(e -> {
            equals(operator);
            result *= 100;
            if(result % 1 == 0){
                textField.setText(Integer.toString((int)result));
            } else {
                textField.setText(Double.toString(result));
            }
            this.operator = "null";
            this.result = 0;
        });

        cButton.addActionListener(e -> {
            this.operator = "null";
            this.result = 0;
            textField.setText("");
        });


        zeroButton.addActionListener(e -> {
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
            if (textField.getText().isEmpty()){
                textField.setText(textField.getText() + "0.");
            } else if(!textField.getText().contains(".")){
                textField.setText(textField.getText() + ".");
            }

        });

        deleteButton.addActionListener(e -> {
            if(!textField.getText().equals("")){
                String str=textField.getText();
                textField.setText(str.substring(0, str.length() - 1));
            }
        });
    }

    private void setOperation(String symbol){
        if(!this.operator.equals("null")){
            equals(operator);
        } else {
            this.result = Double.parseDouble(textField.getText());
        }
        this.operator = symbol;
        textField.setText("");
    }

    private void equals(String operator){
        if(operator.equals("+")){
            this.result += Double.valueOf(textField.getText());
        }
        if(operator.equals("-")){
            this.result -= Double.parseDouble(textField.getText());
        }
        if(operator.equals("/")){
            this.result /= Double.parseDouble(textField.getText());
        }
        if(operator.equals("*")){
            this.result *= Double.parseDouble(textField.getText());
        }
    }
}
