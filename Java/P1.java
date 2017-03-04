package start;
import java.util.Scanner;

public class Start {
	public static void main(String args[]){
		int decision;
		Secon secObjec = new Secon();
		secObjec.printSth();
		
		Scanner start = new Scanner(System.in);
		System.out.println("Type in a integer number");
		int num = start.nextInt();
		System.out.println("Type in a second integer number");
		int snum = start.nextInt();
		secObjec.putInt(num);
		secObjec.putIntt(snum);
		System.out.println("Type in a number 0 for add, 1 for cut, 2 for mulitply\n"
				+ "3 for devide ");
		decision = start.nextInt();
		start.close();
		switch(decision){
		case 0: secObjec.says0();
		break;
		case 1: secObjec.says1();
		break;
		case 2: secObjec.says2();
		break;
		case 3: secObjec.says3();
		break;
		}
		
		
		
	}
}
