import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class TicTacToe extends JFrame implements ActionListener{
    JFrame f;
    int player=0;
    JButton b[]=new JButton[9];
    JButton emp;
    TicTacToe(String s){
	f=new JFrame(s);
	for(int i=0;i<9;i++){
            b[i]=new JButton("");
            b[i].setSize(30, 30);
            b[i].addActionListener((ActionListener) this);
            f.add(b[i]);
        }f.setLayout(new  GridLayout(3,3,10,10));
	f.pack();
	f.setVisible(true);
	f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }@Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b[0]&&"".equals(b[0].getText())){
            if("".equals(b[0].getText())){
                player=1-player;
            if(player==0)
                b[0].setText("0");
            else
                b[0].setText("X");
            }checker();    
        }if(e.getSource()==b[1]&&"".equals(b[1].getText())){
            if("".equals(b[1].getText())){
                player=1-player;
            if(player==0)
                b[1].setText("0");
            else
                b[1].setText("X");
            }checker();    
        }if(e.getSource()==b[2]&&"".equals(b[2].getText())){
            if("".equals(b[2].getText())){
                player=1-player;
            if(player==0)
                b[2].setText("0");
            else
                b[2].setText("X");
            }checker();    
        }if(e.getSource()==b[3]&&"".equals(b[3].getText())){
            if("".equals(b[3].getText())){
                player=1-player;
            if(player==0)
                b[3].setText("0");
            else
                b[3].setText("X");
            }checker();    
        }if(e.getSource()==b[4]&&"".equals(b[4].getText())){
            if("".equals(b[4].getText())){
                player=1-player;
            if(player==0)
                b[4].setText("0");
            else
                b[4].setText("X");
            }checker();    
        }if(e.getSource()==b[5]&&"".equals(b[5].getText())){
            if("".equals(b[5].getText())){
                player=1-player;
            if(player==0)
                b[5].setText("0");
            else
                b[5].setText("X");
            }checker();    
        }if(e.getSource()==b[6]&&"".equals(b[6].getText())){
            if("".equals(b[6].getText())){
                player=1-player;
            if(player==0)
                b[6].setText("0");
            else
                b[6].setText("X");
            }checker();    
        }if(e.getSource()==b[7]&&"".equals(b[7].getText())){
            if("".equals(b[7].getText())){
                player=1-player;
            if(player==0)
                b[7].setText("0");
            else
                b[7].setText("X");
            }checker();    
        }if(e.getSource()==b[8]&&"".equals(b[8].getText())){
            if("".equals(b[8].getText())){
                player=1-player;
            if(player==0)
                b[8].setText("0");
            else
                b[8].setText("X");
            }checker();    
        }
    }void resetgame(int a,int b,int c){
        for(int i=0;i<9;i++)
            this.b[i].setText("");
        player=0;
        this.b[a].setBackground(null);
        this.b[b].setBackground(null);
        this.b[c].setBackground(null);
    }void winner0(int a,int b,int c){
        this.b[a].setBackground(Color.red);
        this.b[b].setBackground(Color.red);
        this.b[c].setBackground(Color.red);
        int response=JOptionPane.showConfirmDialog(rootPane,"Congratulation Second Player won,wana play again.","",JOptionPane.YES_NO_OPTION);
            if(response==0)
                resetgame(a,b,c);    
            else if(response==1)
                System.exit(0);
    }void winnerx(int a,int b,int c){
        this.b[a].setBackground(Color.red);
        this.b[b].setBackground(Color.red);
        this.b[c].setBackground(Color.red);
        int response=JOptionPane.showConfirmDialog(rootPane,"Congratulation First Player won,wana play again.","",JOptionPane.YES_NO_OPTION);
            if(response==0)
                resetgame(a,b,c);    
            else if(response==1)
                System.exit(0);
    }
    void checker(){
        if("X".equals(b[0].getText())&&"X".equals(b[1].getText())&&"X".equals(b[2].getText()))
            winnerx(0,1,2);
        else if("X".equals(b[3].getText())&&"X".equals(b[4].getText())&&"X".equals(b[5].getText()))
            winnerx(3,4,5);
        else if("X".equals(b[6].getText())&&"X".equals(b[7].getText())&&"X".equals(b[8].getText()))
            winnerx(6,7,8);
        else if("X".equals(b[0].getText())&&"X".equals(b[3].getText())&&"X".equals(b[6].getText()))
            winnerx(0,3,6);
        else if("X".equals(b[1].getText())&&"X".equals(b[4].getText())&&"X".equals(b[7].getText()))
            winnerx(1,4,7);
        else if("X".equals(b[2].getText())&&"X".equals(b[5].getText())&&"X".equals(b[8].getText()))
            winnerx(2,5,8);
        else if("X".equals(b[0].getText())&&"X".equals(b[4].getText())&&"X".equals(b[8].getText()))
            winnerx(0,4,8);
        else if("X".equals(b[2].getText())&&"X".equals(b[4].getText())&&"X".equals(b[6].getText()))
            winnerx(2,4,6);
        else if("0".equals(b[0].getText())&&"0".equals(b[1].getText())&&"0".equals(b[2].getText()))
            winner0(0,1,2);
        else if("0".equals(b[3].getText())&&"0".equals(b[4].getText())&&"0".equals(b[5].getText()))
            winner0(3,4,5);
        else if("0".equals(b[6].getText())&&"0".equals(b[7].getText())&&"0".equals(b[8].getText()))
            winner0(6,7,8);
        else if("0".equals(b[0].getText())&&"0".equals(b[3].getText())&&"0".equals(b[6].getText()))
            winner0(0,3,6);
        else if("0".equals(b[1].getText())&&"0".equals(b[4].getText())&&"0".equals(b[7].getText()))
            winner0(1,4,7);
        else if("0".equals(b[2].getText())&&"0".equals(b[5].getText())&&"0".equals(b[8].getText()))
            winner0(2,5,8);
        else if("0".equals(b[0].getText())&&"0".equals(b[4].getText())&&"0".equals(b[8].getText()))
            winner0(0,4,8);
        else if("0".equals(b[2].getText())&&"0".equals(b[4].getText())&&"0".equals(b[6].getText()))
            winner0(2,4,6);
    }public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe("Tic Tac Toe by sushil");
    }
}
