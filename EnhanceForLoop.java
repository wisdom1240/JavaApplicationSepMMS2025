public class EnhancedForloop{
	public static void main(String[] args){
	String[] names = {"John","Jack","Mary","James","Lucy"};
	int[] marks = {69,80,100,70,50};
	for(int i = 0; i < 5; i++){
		if(marks[i] >= 70){
			System.out.printf("Student Name: %s%n,names[i]);
		    System.out.printf("Student Mark: %s%n,marks[i]);
			System.out.printf("Grade: A);
			System.out.println("------------------------------------------\n\n\n");
		}
		else if(marks[i] >= 60){
			System.out.printf("Student Name: %s%n,names[i]);
		    System.out.printf("Student Mark: %s%n,marks[i]);
			System.out.printf("Grade: B);
			System.out.println("------------------------------------------\n\n\n");
		}
		else if(marks[i] >= 50){
			System.out.printf("Student Name: %s%n,names[i]);
		    System.out.printf("Student Mark: %s%n,marks[i]);
			System.out.printf("Grade: C);
			System.out.println("------------------------------------------\n\n\n");
		}
		else if(marks[i] >= 40){
			System.out.printf("Student Name: %s%n,names[i]);
		    System.out.printf("Student Mark: %s%n,marks[i]);
			System.out.printf("Grade: D);
			System.out.println("------------------------------------------\n\n\n");
		}
		else{
			System.out.printf("Student Name: %s%n,names[i]);
		    System.out.printf("Student Mark: %s%n,marks[i]);
			System.out.printf("Grade: D);
			System.out.println("------------------------------------------\n\n\n");
		}
	}
	
	}
		
		
}