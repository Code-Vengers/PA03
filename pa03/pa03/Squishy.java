package pa03;
import java.awt.Color;

public class Squishy extends CircleShape{
	
	public static void main(String[] args){
			Squishy squish=new Squishy();
			System.out.println(squish);
	}
	
	public Squishy(){
		super();
		this.color=new Color(0, 255, 255, 100);
	}
	
	public String toString(){
		return "Squishy circles!; " + super.toString();
	}
}