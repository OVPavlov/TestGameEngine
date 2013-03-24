package Managers;
import javax.swing.JFrame;
import javax.swing.Timer;


public class StartManager 
{

	static Timer updateTimer;
	static JFrame frame;
	public static void Initialize() 
	{		
		Graphic.Initialize(800, 600);
		

		updateTimer = new Timer(20, UpdateManager.GetInstance());	
		updateTimer.start();
		
		
		
	}	
}
