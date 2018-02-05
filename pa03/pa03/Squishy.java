package pa03;

public class Squishy extends CircleShape{
	
	public static void main(String[] args){
			Squishy squish=new Squishy();
			System.out.println(squish);
	}
	
	public String toString(){
		return "Squishy circles!; " + super.toString();
	}
}