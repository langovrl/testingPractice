package practice.coding;

public class SumOfOddDigits {

	public static void getSumOfOddDigits(int i) {
		 int sum=0;
		while(i>0) {
			 int x = i%2;
			 if(x!=0) {
				 sum = i+sum;
			 }
			 i = i-1;
		}
		System.out.println("sum : "+sum);
	}
	
	public static void main(String[] args) {
		
		getSumOfOddDigits(10);
	}
}
