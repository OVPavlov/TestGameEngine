import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.Timer;

public class MyNewClass  
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		JFrame f = new JFrame("qwe1");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(512, 512);
		
		f.setVisible(true);
		
		qwe = new QWE();
		timer1 = new Timer(20,qwe);
		//qwe.qweqweqwe();
		f.add(qwe);
		
		timer1.start();
		
		
		
		System.out.print("qweqweqwe");
	}
	static QWE qwe;
	static Timer timer1;
	


}
