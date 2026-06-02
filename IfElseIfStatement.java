import java.util.Scanner;

public class IfElseIfStatement{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int score;
		String name;
		String subject;
		
		System.out.print("Enter your name: ");
		name = input.nextLine();
		
		System.out.print("Enter your Subject: ");
		subject = input.nextLine();
		
		System.out.print("Enter your Score: ");
		score = input.nextInt();
		
		System.out.println("");
		System.out.println("=========================================");
		
		if(score >= 70){
			System.out.printf("Full Name: %s%n",name);
			System.out.printf("Subject: 5s%n",subject);
			System.out.printf("Score: %d%n",score);
			System.out.println("Grade: A");
		}
		
		
		
	}
}