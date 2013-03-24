package Managers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.util.HashSet;



import Base.BaseGameObject;


public class UpdateManager extends KeyAdapter implements ActionListener
{	
	private static UpdateManager self;
	public static UpdateManager GetInstance() 
	{
		if(self == null) 
		{
			self = new UpdateManager();			
		}
		return self;
	}
	private UpdateManager()
	{
		graphic = Graphic.GetInstance();
		hashmap = new HashSet<BaseGameObject>();
	}
	
	private static Graphic graphic;
	public void actionPerformed(ActionEvent e) 
	{
		for (BaseGameObject element : hashmap) 
		{
			element.Update();
		}
		
		graphic.repaint();
	}
	
	private	static HashSet<BaseGameObject> hashmap;
	public static boolean Add(BaseGameObject object) 
	{
		return hashmap.add(object);
	}
	public static boolean Remove(BaseGameObject object)
	{
		return hashmap.remove(object);		
	}
	
	
	@Override
	public void keyPressed(KeyEvent e) 
	{
		int key = e.getKeyCode();
		setKey(key,true);
	}
	@Override
	public void keyReleased(KeyEvent e) 
	{
		int key = e.getKeyCode();
		setKey(key, false);
	}
	private void setKey(int key,boolean press )
	{
		switch (key) 
		{
		case 38:
			Input.up = press;
			break;
		case 40:
			Input.down = press;
			break;
		case 37:
			Input.left = press;
			break;
		case 39:
			Input.right = press;
			break;

		default:
			break;
		}	
	}
}
