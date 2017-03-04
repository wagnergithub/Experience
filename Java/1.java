package start;

import java.util.Scanner;

public class Start {
	public static void main(String args[]){
		String name;
		Scanner start = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = start.nextLine();
		System.out.println("Hello " + name);
		start.close();				
	}
}
