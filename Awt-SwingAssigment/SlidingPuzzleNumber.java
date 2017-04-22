import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class SlidingPuzzleNumber extends JFrame implements ActionListener{
    JFrame f;
    JButton b[]=new JButton[9];
    static String title[]={"1","2","3","4","5","6","7","8",""};
    JButton emp;
    SlidingPuzzleNumber(String s){
	f=new JFrame(s);
	for(int i=0;i<9;i++){
            b[i]=new JButton(title[i]);
            b[i].addActionListener((ActionListener) this);
            f.add(b[i]);
	}emp=b[8];
        f.setLayout(new  GridLayout(3,3,10,10));
	f.pack();
	f.setVisible(true);
	f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }@Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b[0]){
            if(b[1].getText().equals("")||b[3].getText().equals("")){
                swapButton(b[0]);
                checker();
            }
        }else if(e.getSource()==b[1]){
            if(b[0].getText().equals("")||b[2].getText().equals("")||b[4].getText().equals("")){
                swapButton(b[1]);
                checker();
            }
        }else if(e.getSource()==b[2]){
            if(b[1].getText().equals("")||b[5].getText().equals("")){
                swapButton(b[2]);
                checker();
            }
        }else if(e.getSource()==b[3]){
            if(b[0].getText().equals("")||b[4].getText().equals("")||b[6].getText().equals("")){
                swapButton(b[3]);
                checker();
            }
        }else if(e.getSource()==b[4]){
            if(b[1].getText().equals("")||b[3].getText().equals("")||b[5].getText().equals("")||b[7].getText().equals("")){
                swapButton(b[4]);
                checker();
            }
        }else if(e.getSource()==b[5]){
            if(b[2].getText().equals("")||b[4].getText().equals("")||b[8].getText().equals("")){
                swapButton(b[5]);
                checker();
            }
        }else if(e.getSource()==b[6]){
            if(b[3].getText().equals("")||b[7].getText().equals("")){
                swapButton(b[6]);
                checker();
            }
        }else if(e.getSource()==b[7]){
            if(b[4].getText().equals("")||b[6].getText().equals("")||b[8].getText().equals("")){
                swapButton(b[7]);
                checker();
            }
        }else if(e.getSource()==b[8]){
            if(b[5].getText().equals("")||b[7].getText().equals("")){
                swapButton(b[8]);
                checker();
            }
        }
    }void swapButton(JButton x){
        emp.setText(x.getText());
        x.setText("");
        emp=x;
    }
    void checker(){
        int flag=0;
	for(int i=0;i<9;i++){
            if(!b[i].getText().equals(title[i])){
                flag=1;break;
            }
        }if(flag==0){
            JOptionPane.showConfirmDialog(null,"Congratulation,wana play again.");
            System.out.println("winner");
        }
    }public static void main(String[] args) {
        SlidingPuzzleNumber slidingPuzzleNumber = new SlidingPuzzleNumber("Tic Tac Toe");
    }
}
