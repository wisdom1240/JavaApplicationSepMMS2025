public class Classwork2  {
	public static void main(String[] args){
		int[] arr = {7,8,4,3,2,9,0,1,6,8};
	
		int[] allEven = displayEvenNumber(arr);
		for(int num : allEven){
			System.out.println(num);
		
		}
	}
	public static void displayEvenNumber(int[] numbers){
		int index = 0;
		int[] even = new int[number.length];
		
		for(int i = 0; i < numbers.length; ++){
			if(numbers[1] % 2 == 0){
				even[index] = numbers[i];
				index++;
			}
			
		}
		return even;
	}
		
}