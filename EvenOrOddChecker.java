import java.util.Scanner;

public class EvenOrOddChecker{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		char option;
		
		do{
			System.out.print("Enter any number: ");
			int num = scan.nextint();
			
			if(num % 2 == 0){
				System.out.println("The number is an even number");
			}
			else(
			System.out.println("The number is an odd number");
		}
		
		System.out.print("Do you want to run the program again(Y/N): ";
		option = Scan.next()charAt(0);
		}while(option == 'Y' || or option == 'Y');
		System.out.println("Good bye .....................");
	
		
	}
}
