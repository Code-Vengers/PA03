package pa03;

import java.awt.Color;
import java.awt.Graphics;


public class ElonCircle extends CircleShape {
  private String name;

  public ElonCircle(){
     super();
     this.color = new Color(255,255,0,100); // changes my specific circles into a transparent yellow color
     this.name = "E.M";
   }

   public void draw(Graphics g ) {
     super.draw(g);
     g.drawString(name,25,25); // writes name on the upper left corner of the screen
   }
   public void update (double dt){
     super.update(dt);
     if (this.x > 200 && this.y > 200){
     this.color = new Color(255,0,0,100); // changes my specific circles into a transparent yellow color
    }

   }







public static void main(String[]args){
   ElonCircle x = new ElonCircle();
   System.out.println("my cirlce is " + x);
}
public String toString(){
  return "ElonCircle:" + super.toString();


 }
}
