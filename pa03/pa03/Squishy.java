package pa03;
import java.awt.Color;
import java.awt.Graphics;

public class Squishy extends CircleShape{
		
	private double rx,ry;
	private int counterx, counterx2, countery, countery2;
	
	public Squishy(){
		super();
		this.color=new Color(0, 255, 255, 100);
		rx=super.radius;
		ry=super.radius;
		counterx=0;
		counterx2=0;
		countery=0;
		countery2=0;
	}
	
	public String toString(){
		return "Squishy circles!; " + super.toString();
	}
	
	public void draw(Graphics g){
		int u = (int)(x-rx);
		int v = (int)(y-ry);
		int w = (int)(2*rx);
		int h = (int)(2*ry);
        g.setColor( color );
        g.fillOval( u,v,w,h );
        g.setColor( Color.BLACK );
        g.drawOval(u,v,w,h );
	}
	
	public void keepOnBoard(){		
		if (super.x < this.rx) {
			// it went off the left edge! do something!
			if(counterx<10){
				rx--;
				counterx++;
			}else if(counterx2<10){
				rx++;
				counterx2++;
			}else{
				counterx=0;
				counterx2=0;
				super.vx = -super.vx;
				super.x = this.rx;
			}
		}else if (super.x > CircleShape.boardWidth-this.rx) {
			// it went off the right edge! do something!
			if(counterx<10){
				rx--;
				counterx++;
			}else if(counterx2<10){
				rx++;
				counterx2++;
			}else{
				counterx=0;
				counterx2=0;
				super.vx = -super.vx;
				super.x = CircleShape.boardWidth-this.rx;
			}
		}

		if (super.y < this.ry){
			// it went above the top edge!
			if(countery<10){
				ry--;
				countery++;
			}else if(countery2<10){
				ry++;
				countery2++;
			}else{
				countery=0;
				countery2=0;
				super.vy = -super.vy;
				super.y = this.ry;
			}
		}else if (super.y > CircleShape.boardHeight-this.ry) {
			// it went below the bottom edge!
			if(countery<15){
				ry--;
				countery++;
			}else if(countery2<15){
				ry++;
				countery2++;
			}else{
				countery=0;
				countery2=0;
				super.vy = -super.vy;
				super.y = CircleShape.boardHeight-this.ry;
			}
		}
	}
	
}