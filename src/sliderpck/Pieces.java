package sliderpck;

import javax.swing.*;

public class Pieces {
    String pic;
    int xd;
    int yd;
    ImageIcon image;
    JLabel imageLabel;

    public Pieces(JFrame frame, int x, int y, int z){
        this.xd = x;
        this.yd = y;

        this.pic = "pic"+z+".png";
        this.image = new ImageIcon(this.pic);
        this.imageLabel = new JLabel(this.image);
        frame.add(imageLabel);
        imageLabel.setBounds(this.xd, this.yd, 100, 100);
        this.imageLabel.setVisible(true);
    }

    private void initpic(String pic, JFrame frame,int x, int y){

    }
    public void move(int y,int x){

        this.xd = this.xd + x;
        this.yd = this.yd + y;
       this.imageLabel.setBounds(this.xd,this.yd,100,100);
       this.imageLabel.setVisible(true);
    }

}
