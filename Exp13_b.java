
// write a JAVA program to display analog clock using Applet

// This code is contributed by java_hunt instagram page


import java.util.*;
import java.text.*;
import java.applet.*;
import java.awt.*;
//<applet code="clockdemo" width="550" height="250"></applet>
public class clockdemo extends Applet implements Runnable
{
	int h=0, m=0, s=0;
	String str=""; int wt, ht; Thread thr=null; 
	boolean b;
	public void init()
	{
		wt=getSize().width; ht=getSize().height;
	}
	public void start()
	{
		if (thr==null)
		{
			thr=new Thread(this);
			b=false;
			thr.start();
		}
		else
		{
			if(b)
			{
				b=false;
				synchronized(this)
				{
					notify();
				}
			}
		}
	}
	public void stop()
	{
		b=true;
	}
	public void run()
	{
		try
		{
			while(true)
			{
				Calendar clndr=Calendar.getInstance();
				h=clndr.get(Calendar.HOUR_OF_DAY);
				if(h>12)h-=12;
				m=clndr.get(Calendar.MINUTE); s=clndr.get(Calendar.SECOND); SimpleDateFormat 
				frmatter=new SimpleDateFormat("hh:mm:ss",
				Locale.getDefault());
				Date d=clndr.getTime(); str=frmatter.format(d);
				if(b)
				{
					synchronized (this)
					{
						while(b)
							wait();
					}
				}
				repaint();
				thr.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	void drawHand(double angle, int radius, Graphics grp)
	{
		angle-=0.5*Math.PI;
		int a=(int)(radius*Math.cos(angle)); int b=(int)(radius*Math.sin(angle)); 
		grp.drawLine(wt/2,ht/2,wt/2+a,ht/2+b);
	}
	void drawWedge(double angle,int radius, Graphics grp)
	{
		angle-=0.5*Math.PI;
		int a=(int)(radius*Math.cos(angle)); int b=(int)(radius*Math.sin(angle)); 
		angle+=2*Math.PI/3;
		int a2=(int)(5*Math.cos(angle)); int b2=(int)(5*Math.sin(angle)); 
		angle+=2*Math.PI/3;
		int a3=(int)(5*Math.cos(angle)); int b3=(int)(5*Math.sin(angle)); 
		grp.drawLine(wt/2+a2, ht/2+b2,wt/2+a,ht/2+b); grp.drawLine(wt/2+a3, 
		ht/2+b3,wt/2+a,ht/2+b); grp.drawLine(wt/2+a2, ht/2+b2,wt/2+a3,ht/2+b3);
	}
	public void paint(Graphics grp)
	{
		grp.setColor(Color.gray);
		drawWedge(2*Math.PI*h/12,wt/5,grp); drawWedge(2*Math.PI*m/60,wt/3,grp); 
		drawHand(2*Math.PI*s/60,wt/2,grp);
	}
}