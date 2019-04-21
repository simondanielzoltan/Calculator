import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calc2 extends JFrame implements ActionListener{

    String[] titles = {"1", "2", "C", "D"};
    JLabel out;

    public Calc2() {
        setTitle("Valami");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(400,400);
        out = new JLabel("Result: ");
        out.setBounds(10, 10, 50,10);
        add(out);

        int i = 0;
        for(int x = 0; x < 2; x++) {
            for(int y = 0; y < 2; y++) {
                JButton jb = new JButton(titles[i++]);
                jb.setBounds(x*80+70, y*30+10, 60, 20);
                jb.addActionListener(this);
                add(jb);
            }
        }
        setLayout(null);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent arg0) {
        out.setText("Result: " + arg0.getActionCommand());
    }

}