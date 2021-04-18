package practice.coding;

public class SumOfOddDigitsInAnyNumber {

	public static void getSumOdd(int i){
		int temp = 0;
		int sum = 0;
		while (i > 0) {
			temp = i % 10;
			if (temp % 2 != 0) {
				// System.out.println(sum+"temp"+(temp%10));
				sum = sum + (temp);
			}
			i = i / 10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		getSumOdd(123456789);
	}

}
