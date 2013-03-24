import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class QWE extends JPanel  implements ActionListener
{
	Image img1= new ImageIcon("E:/Downloads/photo.jpg").getImage();
	
	float x=100;
	float y=100;
	
	float vx=-2;
	float vy=-3;
	
	public QWE()
	{
		addKeyListener(new Input());
		setFocusable(true);
	}
	
	public static class Input extends KeyAdapter
	{
		
		public static boolean  up = false;
		public static boolean  down = false;
		public static boolean  left = false;
		public static boolean right = false;
		
		@Override
		public void keyPressed(KeyEvent e) 
		{
			int k = e.getKeyCode();
			if (k==38) 
			{
				up = true;
			}
			
			if (k==40) 
			{
				down = true;
			}
			
			if (k==37) 
			{
				left = true;
			}
			
			if (k==39) 
			{
				right = true;
			}
		}
		@Override
		public void keyReleased(KeyEvent e) 
		{
			int k = e.getKeyCode();
			if (k==38) 
			{
				up = false;
			}
			
			if (k==40) 
			{
				down = false;
			}
			
			if (k==37) 
			{
				left = false;
			}
			
			if (k==39) 
			{
				right = false;
			}
		}
		
	}
	
	public void paint(Graphics g)
	{
		g = (Graphics2D) g;
		g.clearRect(0, 0, 512, 512);
		g.drawImage(img1, (int)x, (int)y, null);
		
		
	}	
	public void actionPerformed(ActionEvent e) 
	{
		if(Input.up){
			vy-=1;
		}
		
		if(Input.down){
			vy+=1;
		}
		
		if(Input.left){
			vx-=1;
		}
		
		if(Input.right){
			vx+=1;
		}
		
		
		if (y<0) 
		{
			y=0;
			vy=-vy;
		}
		
		if (x<0) 
		{
			x=0;
			vx=-vx;
		}
		int a1 = 450;
		int a2 = a1-20;
		
		if (y>a2) 
		{
			y=a2;
			vy=-vy;
		}
		
		if (x>a1) 
		{
			x=a1;
			vx=-vx;
		}



		vy *=0.97;
		vx *=0.97;
		x+=vx;
		y+=vy;			
		repaint();		
	}
}
