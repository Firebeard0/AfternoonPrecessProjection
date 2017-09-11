package process.model;

public class PlayDohCircle
{
	private int size;
	
	public PlayDohCircle()
	{
		this.size = 5;
		
	}
	
	public PlayDohCircle(int size)
	{
		this.size = size;
		
	}
	public String toString()
	{
		String  description = "I am a circle, my size is " + size;
		return description;
	}
}