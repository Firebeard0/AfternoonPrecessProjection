package process.controller;

import process.model.PlayDohCircle;
public class ProcessController
{
	public void start()
	{
		System.out.println("this is a Practice project");
		
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		
		System.out.println(firstCircle);
		System.out.println(secondCircle);
		
		PlayDohCircle thirdCircle = new PlayDohCircle(10);
		System.out.println(thirdCircle);
		
		
	} 
}
