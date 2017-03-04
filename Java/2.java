package test;

import java.util.Scanner;

public class Start{
	public static void main(String args[]){
		int numb;
		System.out.println("Enter a number");
		Scanner start = new Scanner(System.in);
		numb = start.nextInt();
		
		if (numb < 5)
		{
		System.out.println("The number is smaller than 5");
		}
		
		else if (numb > 5){
		System.out.println("The number is bigger than 5");
		}

		else
		{
		System.out.println("The number is 5");
		}

		start.close();
			
		System.out.println("Number gets increased");
			
		for(int counter = 1;counter <=5;counter++){
		System.out.println("The number is " + numb);
		numb ++;
		}
		
		}
	}