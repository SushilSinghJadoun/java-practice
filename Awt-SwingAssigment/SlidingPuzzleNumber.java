import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.*;
class SlidingPuzzleNumber extends JFrame implements ActionListener{
    JFrame f;
    JButton b[]=new JButton[9];
    static String title[]={"1","2","3","4","5","6","7","8",""};
    static String suffleTitle[]={"2","4","3","7","1","6","5","","8"};

    //static String suffleTitle[]=new String[9];

    JButton emp;
    /*void shuffle(){
        List<String>l=Arrays.asList(title);
        ArrayList<String>al=new ArrayList<>(l);
        Collections.shuffle(al);
        for(int i=0;i<9;i++){
            suffleTitle[i]=al.get(i);
        }
    }*/
    SlidingPuzzleNumber(String s){
	f=new JFrame(s);
        //shuffle();
	for(int i=0;i<9;i++){
            if(suffleTitle[i].equals("")){
                b[i]=new JButton(suffleTitle[i]);
                emp=b[i];
            }else{
                b[i]=new JButton(suffleTitle[i]);
            }b[i].addActionListener((ActionListener) this);
            f.add(b[i]);
	}f.setLayout(new  GridLayout(3,3,10,10));
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
            int response=JOptionPane.showConfirmDialog(rootPane,"Congratulation you completed,wana play again.","",JOptionPane.YES_NO_OPTION);
            if(response==0){
                //shuffle();
                for(int i=0;i<9;i++){
                    if(suffleTitle[i].equals("")){
                        b[i].setText(suffleTitle[i]);
                        emp=b[i];
                    }else
                        b[i].setText(suffleTitle[i]);
                }
            }else if(response==1){
                System.exit(0);
            }
        }
    }public static void main(String[] args) {
        new SlidingPuzzleNumber("Sliding puzzle by sushil");
    }
}
