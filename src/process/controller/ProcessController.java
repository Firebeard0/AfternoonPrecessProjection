package process.controller;

import process.model.PlayDohCircle;
import  java.util.Scanner;

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
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("how big of a circle  do you want?");
		int circleSize = myScanner.nextInt();
		PlayDohCircle thirdCircle = new PlayDohCircle(circleSize);
		System.out.println(thirdCircle);
		
		System.out.println("What size should we change it to?");
		int updated = myScanner.nextInt();
		thirdCircle.setSize(updated);
		System.out.println("The circle is now ");
		System.out.println(thirdCircle);
	} 
}
