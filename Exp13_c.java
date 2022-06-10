// write a JAVA program to create different shapes and fill colors using Applet

// This code is contributed by java_hunt instagram page


import java.awt.*;
import java.applet.*;
//<applet code="graphicsdemo" width="400" height="400"></applet> 
public class graphicsdemo extends Applet
{
	public void paint(Graphics g)
	{
		int x[]={10,220,220};
		int y[]={400,400,520};
		int n=3;
		g.drawLine(10,30,200,30);
		g.setColor(Color.blue); g.drawRect(10,40,200,30);
		g.setColor(Color.red); g.fillRect(10,80,200,30); g.setColor(Color.orange); 
		g.drawRoundRect(10,120,200,30,20,20);
		g.setColor(Color.green); g.fillRoundRect(10,160,200,30,20,20);

		g.setColor(Color.blue); g.drawOval(10,200,200,30);
		g.setColor(Color.black); g.fillOval(10,240,40,40); 
		g.setColor(Color.yellow); g.drawArc(10,290,200,30,0,180); 
		g.setColor(Color.yellow); g.fillArc(10,330,200,30,0,180);
		g.setColor(Color.pink); g.fillPolygon(x,y,n);
	}
}
