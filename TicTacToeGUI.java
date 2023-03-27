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
        buttona1 = new JButton("");buttonb1 = new JButton("");buttonc1 = new JButton("");buttona2 = new JButton("");buttonb2 = new JButton("");buttonc2 = new JButton("");buttona3 = new JButton("");buttonb3 = new JButton("");buttonc3 = new JButton("");
        buttona1.addActionListener(this);buttona2.addActionListener(this);buttona3.addActionListener(this);buttonb1.addActionListener(this);buttonb2.addActionListener(this);buttonb3.addActionListener(this);buttonc1.addActionListener(this);buttonc2.addActionListener(this);buttonc3.addActionListener(this);
        label1= new JLabel();
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
        count++;TicTacToeBoard theBoard = new TicTacToeBoard();
        int currentPlayer = 0;
        currentPlayer++;
        if(currentPlayer>2){
            currentPlayer=1;
        }
        label1.setText("# of times you argee: "+count);
        int row=-1;
        int col=-1;
        String playergoing = "";
        if(theBoard.getGameStatus() == 0) {//checks player
            if (currentPlayer == 1) {
                label1.setText("Player 1 turn");
                playergoing ="Player 1 turn";
                currentPlayer = 2;
            } else { //currentPlayer = 2
                label1.setText("Player 2 turn");
                playergoing ="Player 2 turn";
                currentPlayer = 1;
            }
        

        // \/ This is to make row and col
        if(e.getSource()==buttona1){
            //buttona1.setText("argee: "+count);                    // This is to firgure out what button was clicked
            row = 1;
            col = 1;
        }else if(e.getSource()==buttona2){
            row = 1;
            col = 2;
        }else if(e.getSource()==buttona3){
            row = 1;
            col = 3;
        }else if(e.getSource()==buttonb1){
            row = 2;
            col = 1;
        }else if(e.getSource()==buttonb2){
            row = 2;
            col = 2;
        }else if(e.getSource()==buttonb3){
            row = 2;
            col = 3;
        }else if(e.getSource()==buttonc1){
            row = 3;
            col = 1;
        }else if(e.getSource()==buttonc2){
            row = 3;
            col = 2;
        }else if(e.getSource()==buttonc3){
            row = 3;
            col = 3;
        }   
        

        while(theBoard.isValidMove(row,col)==false){//TO check if move is good 
            label1.setText("That is not possible, it is still "+playergoing);
            if(e.getSource()==buttona1){
                //buttona1.setText("argee: "+count);                    // This is to firgure out what button was clicked
                row = 1;
                col = 1;
            }else if(e.getSource()==buttona2){
                row = 1;
                col = 2;
            }else if(e.getSource()==buttona3){
                row = 1;
                col = 3;
            }else if(e.getSource()==buttonb1){
                row = 2;
                col = 1;
            }else if(e.getSource()==buttonb2){
                row = 2;
                col = 2;
            }else if(e.getSource()==buttonb3){
                row = 2;
                col = 3;
            }else if(e.getSource()==buttonc1){
                row = 3;
                col = 1;
            }else if(e.getSource()==buttonc2){
                row = 3;
                col = 2;
            }else if(e.getSource()==buttonc3){
                row=3;
                col = 2;
        }

        
        
        
        
        
    }
    if(theBoard.isValidMove(row, col)==true){//changes the button text
        if(e.getSource()==buttona1){
            buttona1.setText(xoros(currentPlayer));
        }else if(e.getSource()==buttona2){
            buttona2.setText(xoros(currentPlayer));
        }else if(e.getSource()==buttona3){
            buttona3.setText(xoros(currentPlayer));
        }else if(e.getSource()==buttonb1){
            buttonb1.setText(xoros(currentPlayer));
        }else if(e.getSource()==buttonb2){
            buttonb2.setText(xoros(currentPlayer));
        }else if(e.getSource()==buttonb3){
            buttonb3.setText(xoros(currentPlayer));
        }else if(e.getSource()==buttonc1){
            buttonc1.setText(xoros(currentPlayer));
        }else if(e.getSource()==buttonc2){
            buttonc2.setText(xoros(currentPlayer));
        }else if(e.getSource()==buttonc3){
            buttonc3.setText(xoros(currentPlayer));
        } 
        }
        theBoard.makeMove(row, col, currentPlayer);
        

        }
        
    }






    public String xoros(int currentPlayers){
        String fact="";
        if(currentPlayers==1){
            fact ="x";
        }else if (currentPlayers==2){
            fact= "o";
        }
        return fact;
    }
}
//player one is x's (1) and player two is o's (2)