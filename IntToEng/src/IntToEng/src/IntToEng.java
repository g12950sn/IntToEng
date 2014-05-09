package IntToEng.src;

import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(translateEng(input));
	}

	public static String translateEng(int number) {

		String[] keta1 = { "", "one", "two", "three", "four", "five",
				"six", "seven", "eight", "nine", "ten", "eleven", "twelve",
				"thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen", };
		String[] keta2 = { "", "", "twenty", "thirty", "forty", "fifty",
				"sixty", "seventy", "eighty", "ninety" };
		// String[] keta3 =
		// {"","one hundred","two hundred","three hundred","four hundred","five hundred","six hundred","seven hundred"}
		if(number == 0) return "zero";
		if (number < 20) {
			return number + " " + keta1[number];
		} else if (number < 100)
			return number + " " + keta2[number / 10] + " " + keta1[number % 10];
		else if (number < 1000) {
			int a = number / 100;
			int b = number - a * 100;
			return number + " " + keta1[a] + " hundred " + keta2[b / 10]
					+ " " + keta1[b % 10];
		} else {
			int c = number / 1000;
			int d = number - c * 1000;
			int e = d / 100;
			int f = d - e * 100;
			if (e == 0) {
				return number + " " + keta1[c] + " thousand " + keta2[f / 10]
						+ " " + keta1[f % 10];
			} else
				return number + " " + keta1[c] + " thousand " + keta1[e]
						+ " hundred " + keta2[f / 10] + " " + keta1[f % 10];
		}
	}
}