import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		/*System.out.println("Enter a number:");
		int value=scanner.nextInt();
		while (value !=5) {
			System.out.println("Try again");
			value=scanner.nextInt();*/
		int value=0;
		do {
			System.out.println("Enter a value:");
			 value=scanner.nextInt();
			 
		}
		while(value !=5);{
		System.out.println("Got it!");
	}
		}
	}
 

