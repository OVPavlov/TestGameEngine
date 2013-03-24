import javax.swing.ImageIcon;
import Base.*;
import Managers.*;


public class SomeClass extends BaseGameObject 
{
	float vx = 0;
	float vy = 0;
	
	public SomeClass()
	{
		image = new ImageIcon("E:/Downloads/photo.jpg").getImage();
		UpdateManager.Add(this);
		Graphic.Add(this);
	}
	
	@Override
	public void Update() 
	{
		if(Input.up)
		{
			vy -= 1;
		}
		
		if(Input.down)
		{
			vy += 1;
		}
		
		if(Input.left)
		{
			vx -= 1;
		}
		
		if(Input.right)
		{
			vx += 1;
		}
		
		
		if (y < 0) 
		{
			y = 0;
			vy =- vy;
		}
		
		if (x < 0) 
		{
			x = 0;
			vx =- vx;
		}
		int a1 = 450;
		int a2 = a1 - 20;
		
		if (y > a2) 
		{
			y = a2;
			vy =- vy;
		}
		
		if (x > a1) 
		{
			x = a1;
			vx =- vx;
		}



		vy *= 0.97;
		vx *= 0.97;
		x += vx;
		y += vy;	
	}
}
