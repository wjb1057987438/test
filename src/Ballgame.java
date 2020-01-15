import javax.swing.*;
import java.awt.*;

public class Ballgame  extends JFrame {
    Image ball= Toolkit.getDefaultToolkit().getImage("img/ball.png");
    Image desk= Toolkit.getDefaultToolkit().getImage("img/desk.jpg");

    double x=100;
    double y=100;
//    int dir=1;
    double degree=Math.PI/3;

    public  void  paint(Graphics g){
        System.out.println("绘制窗口");
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int) x,(int)y,null);
        x=x+10*Math.cos(degree);
        y=y+10*Math.sin(degree);
/*
        if(x>856-50-20){
            dir=-1;
        }
        if (x<0+50){
            dir=1;
        }
        x +=dir*10;

 */
        if(y<40+40||y>500-40-30){
            degree=-degree;
        }
        if(x<40||x>856-40-30){
            degree=Math.PI-degree;
        }
    }
    void  launchFrame(){
        setSize(856,500);
        setLocation (50,50);
        setVisible(true);

        while (true){
            repaint();
            try{
                Thread.sleep(40);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
    public static void main(String[] args) {
        Ballgame ballgame=new Ballgame();
        ballgame.launchFrame();

    }
}
