package IntToEng.src;

import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(translateEng(input));
	}

	public static String translateEng(int number) {
		String[] keta1 = { "zero", "one", "two", "three", "four", "five",
				"six", "seven", "eight", "nine", "ten", "eleven", "twelve",
				"thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen", };
		String[] keta2 = { "", "", "twenty", "thirty", "forty", "fifty",
				"sixty", "seventy", "eighty", "ninety" };
		if (number < 20) {
			return number + " " + keta1[number];
		} else if (number < 100)
			return number + " " + keta2[number / 10] +" "+ keta1[number % 10];
		else {
			int a = number / 100;
			int b = number - a * 100;
			return number + " " + keta1[number / 100] +" "+ "hundred" +" "+ keta2[b / 10]
					+" "+ keta1[b % 10];
		}
	}
}