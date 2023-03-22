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
    private JButton button;

    public TicTacToeGUI(){
        Frame = new JFrame();
        pannel = new JPanel();
        button = new JButton("Charles is gay");
        button.addActionListener(this);
        label1= new JLabel("Number of times you argee: "+count);
        pannel.setBorder(BorderFactory.createEmptyBorder(30, 10, 30, 30));
        pannel.setLayout(new GridLayout());
        pannel.add(button);
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
        label1.setText("Number of times you argee: "+count);
    }
}
