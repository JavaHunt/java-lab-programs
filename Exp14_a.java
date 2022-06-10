// write a JAVA program that display the x and y position of the cursor movement using Mouse.

// This code is contributed by java_hunt instagram page

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="mouseevent" width=450 height=300></applet> 

class mouseevent extends Applet implements MouseListener, MouseMotionListener 
{
	String s1=" ";
	int x,y;  // Co-ordinates to show message on screen
	
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		x=100;
		y=100;
		s1="Mouse clicked";
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{
		x=100;
		y=200;
		s1="Mouse entered";
		repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		x=10;
		y=300;
		s1="Mouse exited";
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		s1="Mouse Pressed";
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		s1="Mouse Realeased";
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		s1="Mouse Dragged";
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		s1="Mouse Moved";
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(s1,x,y);
	}
}
