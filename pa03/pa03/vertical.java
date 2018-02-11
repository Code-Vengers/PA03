package pa03;
import java.awt.Color;
import java.awt.Graphics;

public class vertical extends CircleShape{
	private Color borderColor = new Color(0,0,255);

	public vertical() {
		super();
		this.color = new Color(0,255,0);
		this.x = (int)(500*Math.random());
		this.y = (int)(500*Math.random());
		this.radius = 10 + (int)(40*Math.random());
		this.vy +=15;
	}
	public void draw( Graphics g ) {
		int u = (int)(x-radius);
		int v = (int)(y-radius);
		int w = (int)(2*radius);
		int h = w;
        g.setColor(this.color);
        g.fillOval( u,v,w,h);
        g.setColor(this.borderColor);
        g.drawOval(u,v,w,h);
    }	
	public void update(double dt){
		this.y += dt*vy;
		this.keepOnBoard();
	}
 }