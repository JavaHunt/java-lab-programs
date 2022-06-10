
// write a JAVA program that identifies key-up key-down event user entering text in a Applet.

// This code is contributed by java_hunt instagram page

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="keyevent" width=450 height=300></applet> 
class keyevent extends Applet implements KeyListener
{
	String s1=" ";
	int x,y;
	TextField t = new TextField(30);
	public void init()
	{
		addKeyListener(this);
		requestFocus();
		add(t);
	}
	public void keyPressed(KeyEvent ke)
	{
		x=100;
		y=200;
		s1= "key pressed : " + ke.getKeyText(ke.getKeyCode());
		repaint();
	}
	public void keyReleased(KeyEvent ke)
	{
		x=100;
		y=400;
		s1= "key Released : " + ke.getKeyText(ke.getKeyCode());
		repaint();

	}
	public void keyTyped(KeyEvent ke)
	{
		x = 100;
		y = 300;
		s1 = s1+ke.getKeyChar();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(s1,x,y);
	}
}
