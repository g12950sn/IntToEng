package IntToEng.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(translateEng(input));
	}

	static String translateEng(int n) {
		String[] keta1 = { "zero", "one", "two", "three", "four", "five",
				"six", "seven", "eight", "nine", "ten", "eleven", "twelve",
				"thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen", };
		String[] keta2 = { "", "", "twenty", "thirty", "forty", "fifty",
				"sixty", "seventy", "eighty", "ninety" };
		if (n < 20) {
			return n + " " + keta1[n];
		} else if (n < 100)
			return n + " " + keta2[n / 10] + keta1[n % 10];
		else {
			int a = n / 100;
			int b = n - a * 100;
			return n + " " + keta1[n / 100] + "handred" + keta2[b / 10]
					+ keta1[b % 10];
		}
	}
}