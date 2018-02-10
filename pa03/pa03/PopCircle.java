//Jacob's Circle
//Circles grow untill a certian size, then pop, and return to their original smaller size.
package pa03;
import java.awt.Color;

public class PopCircle extends CircleShape{
private double popSize = (100*Math.random());
  public static void main(String[] args) {
    PopCircle pop = new PopCircle();
  }

  public PopCircle(){
    super();
    this.color = new Color(255,0,0,100);
  }
  public void update(double dt){
      if (this.radius < popSize){
        this.radius += .1;
      }
      else if (this.radius > popSize){
        this.radius = dt;
        System.out.println("I got here.");
      }
      super.update(dt);
  }
  public String toString(){
    return "PopCircle;" + super.toString();
  }
}
