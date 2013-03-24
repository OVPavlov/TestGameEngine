package Base;

import java.awt.Image;

public class BaseGameObject 
{
	private static int nextId=0;
	private int id = -1;
	@Override
	public int hashCode() 
	{
		if(id == -1) id = ++nextId;
		return id;
	}

	public float x;
	public float y;
	public Image image;
	
	public void Update() {}
}
