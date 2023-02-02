package Maskify;

import java.util.Scanner;

public class Backwards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
			System.out.println("Enter your word: ");
			String Word = scan.nextLine();
			System.out.print(Word + "-->");
			for(int i = Word.length()-1; i >= 0; i--) {
				System.out.print(Word.charAt(i));
			}	
	}

}
