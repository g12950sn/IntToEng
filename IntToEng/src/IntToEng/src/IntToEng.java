	package IntToEng.src;
	
	import java.util.Scanner;
	
	public class IntToEng {
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			System.out.println(translateEng(input));
		}
	
	
	static String translateEng(int n){
		String [] keta1 = new String[20];
		keta1[0] = "zero"; 
				keta1[1] = " one";
				keta1[2] = " two";
				keta1[3] = " three";
				keta1[4] = " four";
				keta1[5] = " five";
				keta1[6] = " six";
				keta1[7] = " seven";
				keta1[8] = " eight";
				keta1[9] = " nine";
				keta1[10] = " ten";
				keta1[11] = " eleven";
				keta1[12] = " twelve";
				keta1[13] = " thirteen";
				keta1[14] = " fourteen";
				keta1[15] = " fifteen";
				keta1[16] = " sixteen";
				keta1[17] = " seventeen";
				keta1[18] = " eighteen";
				keta1[19] = " nineteen";
				
		return n+" "+keta1[n];
	}
	}