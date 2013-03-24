package Managers;

import java.awt.Graphics2D;
import java.util.HashSet;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Base.*;

public class Graphic extends JPanel
{
	private static final long serialVersionUID = 4748481904810759769L; //не знаю зачем...
	private static Graphic self;
	public static Graphic GetInstance() 
	{
		if(self == null) 
		{
			self = new Graphic();			
		}
		return self;
	}
	private Graphic(){}
	private	static JFrame frame;
	
	public static int Width;
	public static int Height;
	
	private	static HashSet<BaseGameObject> hashmap;

	public static void Initialize(int width, int height) 
	{
		Width = width;
		Height = height;
		
		
		self = new Graphic();
		frame = new JFrame("Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);		
		frame.setVisible(true);
		frame.add(self);
		
		self.setFocusable(true);
		self.addKeyListener(UpdateManager.GetInstance());
		
		hashmap = new HashSet<BaseGameObject>();
	}
	
	public static boolean Add(BaseGameObject object) 
	{
		return hashmap.add(object);
	}
	public static boolean Remove(BaseGameObject object)
	{
		return hashmap.remove(object);		
	}
	
	
	public void paint(java.awt.Graphics g) 
	{
		g = (Graphics2D) g;
		g.clearRect(0, 0, Width, Height);
		
		for (BaseGameObject element : hashmap) 
		{
			g.drawImage(element.image, (int)element.x, (int)element.y, null);
		}
	}
}
