package xpattern;
import java.util.Scanner;

//Write a program to print the “X” pattern
public class xPattern {
	
	public static void main(String[] args)
	{
		Scanner keyboard =new Scanner (System.in);
		//Accept a number from user
	    System.out.println(" Please type a number grater than 2 :");
	    int num=keyboard.nextInt();
	    drawCross(num);
		keyboard.close();

	}

	private static void drawCross(int num) {

	int startCur = 0; 
	int endCur = num-1; 
	for (int i = 0; i < num; i++) 
	{ 
	for (int j = 0; j < num; j++) 
	{ 
	if (startCur == endCur && j == i) 
	System.out.print('*'); 
	else if (startCur == j || endCur == j) 
	System.out.print('*'); 
	else 
	System.out.print(' '); 
	} 
	startCur++; 
	endCur--; 
	System.out.println(); 

	} 

	}
	
}


