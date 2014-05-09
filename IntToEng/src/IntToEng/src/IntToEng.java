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
		String[] keta1 = new String[20];
		try {
			File file = new File(
					"/home/usrc/g12950sn/mac/git/i/IntToEng/src/IntToEng/src/Number.txt");
			@SuppressWarnings("resource")
			FileReader filereader = new FileReader(file);

			int ch;
			int i = 0;
			while ((ch = filereader.read()) != -1) {
				// System.out.print((char)ch);
				keta1[i] = Integer.toString(ch);
				i++;
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		return n + " " + keta1[n];
	}
}