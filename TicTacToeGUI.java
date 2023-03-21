import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class TicTacToeGUI {

    public TicTacToeGUI(){
        JFrame Frame = new JFrame();
        JPanel pannel = new JPanel();
        JButton button = new JButton("Charles is gay");
        pannel.setBorder(BorderFactory.createEmptyBorder(30, 10, 30, 30));
        pannel.setLayout(new GridLayout());
        pannel.add(button);
        Frame.add(pannel, BorderLayout.CENTER);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setTitle("Something works");
        Frame.pack();
        Frame.setVisible(true);
    }

    public static void main(String[] args) {
        new TicTacToeGUI();
    }
}
