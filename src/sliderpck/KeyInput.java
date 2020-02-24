package sliderpck;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class KeyInput{
    int[][] done = {{1,2,3},{4,5,6},{7,8,9}};
    int[][] board = {{6,7,8},{2,9,3},{5,4,1}};
    int[] current9 = {1,1};
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    Pieces pieces1 = new Pieces(frame,205,205,1);
    Pieces pieces2 = new Pieces(frame,5,105,2);
    Pieces pieces3 = new Pieces(frame,205,105,3);
    Pieces pieces4 = new Pieces(frame,105,205,4);
    Pieces pieces5 = new Pieces(frame,5,205,5);
    Pieces pieces6 = new Pieces(frame,5,5,6);
    Pieces pieces7 = new Pieces(frame,105,5,7);
    Pieces pieces8 = new Pieces(frame,205,5,8);
    Pieces pieces9 = new Pieces(frame,105,105,9);
    Pieces pieces0 = new Pieces(frame,5,5,0);


Runnable r = new Runnable() {


@Override
public void run() {


        frame.addKeyListener(new KeyListener() {

@Override
public void keyTyped(KeyEvent e) {}

@Override
public void keyReleased(KeyEvent e) {
}

@Override
public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_LEFT && current9[1] != 2) {
                board[current9[0]][current9[1]] = board[current9[0]][current9[1]+1];
                current9[1] = current9[1]+1;
                board[current9[0]][current9[1]] = 9;

                moveApiece(-100,0,board[current9[0]][current9[1]-1]);
                pieces9.move(0,100);

        }
        if(key == KeyEvent.VK_RIGHT && current9[1] != 0){
        board[current9[0]][current9[1]] = board[current9[0]][current9[1]-1];
        current9[1] = current9[1]-1;
        board[current9[0]][current9[1]] = 9;

                moveApiece(100,0,board[current9[0]][current9[1]+1]);
                pieces9.move(0,-100);

              /*  System.out.println(board[2][2]);
                System.out.println(board[2][1]);
                System.out.println(board[2][0]);*/

        }
        if(key == KeyEvent.VK_UP && current9[0] != 2){
            board[current9[0]][current9[1]] = board[current9[0]+1][current9[1]];
            current9[0] = current9[0]+1;
            board[current9[0]][current9[1]] = 9;

            moveApiece(0,-100,board[current9[0]-1][current9[1]]);
            pieces9.move(100,0);
        }
        if(key == KeyEvent.VK_DOWN && current9[0] != 0){
            board[current9[0]][current9[1]] = board[current9[0]-1][current9[1]];
            current9[0] = current9[0]-1;
            board[current9[0]][current9[1]] = 9;

            moveApiece(0,100,board[current9[0]+1][current9[1]]);
            pieces9.move(-100,0);
        }


        }
        });

        panel.setFocusable(true);
        panel.requestFocusInWindow();
        frame.setResizable(false);
        frame.setBounds(0,0,315,335);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        };

public void moveApiece(int x, int y,int z){
        switch (z){
                case 1:pieces1.move(y,x);
                break;
                case 2:pieces2.move(y,x);
                break;
                case 3:pieces3.move(y,x);
                break;
                case 4:pieces4.move(y,x);
                break;
                case 5:pieces5.move(y,x);
                break;
                case 6:pieces6.move(y,x);
                break;
                case 7:pieces7.move(y,x);
                break;
                case 8:pieces8.move(y,x);
                break;
                case 9:pieces9.move(y,x);


        }
    if (board[2][2] == done[2][2] && board[0][0] == done[0][0] && board[0][2] == done[0][2] && board[2][0] == done[2][0] && board[1][1] == done[1][1] && board[1][2] == done[1][2] &&board[2][1] == done[2][1] && board[0][1] == done[0][1] &&board[1][0] == done[1][0]
    ){
        pieces0.move(200,200);
        pieces9.move(100,100);
        System.out.println("Done! Good job");

    }


}
public void newMix(){
    Random rand = new Random();
    int[] numb ={1,2,3,4,5,6,7,8,9};
    int randnum = rand.nextInt(9);
    int xd;
    int yd;


/*    for (int i = 9; i != 0; i--) {
        randnum = rand.nextInt(i+1);
        xd = (numb[randnum]%3)*100;
        yd = (numb[randnum]/3)*100;
        System.out.println(xd);
        System.out.println(yd);
        System.out.println(i);
        moveApiece(xd,yd,i);
        numb[randnum] = i;
    }*/





}





}


