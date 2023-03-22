import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Button;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class TicTacToeGUI implements ActionListener{

    private int count =0;
    private JLabel label1;
    private JFrame Frame;
    private JPanel pannel;
    private JButton buttona1;private JButton buttonb1;private JButton buttonc1;private JButton buttona2;private JButton buttonb2;private JButton buttonc2;private JButton buttona3;private JButton buttonb3;private JButton buttonc3;

    public TicTacToeGUI(){
        Frame = new JFrame();
        pannel = new JPanel();
        buttona1 = new JButton("Charles is gay");buttonb1 = new JButton("Charles is gay");buttonc1 = new JButton("Charles is gay");buttona2 = new JButton("Charles is gay");buttonb2 = new JButton("Charles is gay");buttonc2 = new JButton("Charles is gay");buttona3 = new JButton("Charles is gay");buttonb3 = new JButton("Charles is gay");buttonc3 = new JButton("Charles is gay");
        buttona1.addActionListener(this);buttona2.addActionListener(this);buttona3.addActionListener(this);buttonb1.addActionListener(this);buttonb2.addActionListener(this);buttonb3.addActionListener(this);buttonc1.addActionListener(this);buttonc2.addActionListener(this);buttonc3.addActionListener(this);
        label1= new JLabel("Number of times you argee: "+count);
        pannel.setBorder(BorderFactory.createEmptyBorder(30, 10, 30, 30));
        pannel.setLayout(new GridLayout(4,3));
        pannel.add(buttona1);pannel.add(buttona2);pannel.add(buttona3);pannel.add(buttonb1);pannel.add(buttonb2);pannel.add(buttonb3);pannel.add(buttonc1);pannel.add(buttonc2);pannel.add(buttonc3);
        pannel.add(label1);
        Frame.add(pannel, BorderLayout.CENTER);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setTitle("Something works");
        Frame.pack();
        Frame.setVisible(true);
    }

    public static void main(String[] args) {
        new TicTacToeGUI();
    }

    public void actionPerformed(ActionEvent e){
        count++;
        label1.setText("# of times you argee: "+count);
    }
    public void actionPerformed1(ActionEvent e){
        count++;
        label1.setText("Works: "+count);
    }
}
