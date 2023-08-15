package kodluyoruzYazChallenge;

import java.util.Scanner;

public class challenge13Medium {
	// Kullanıcıdan bir kelime almanız gerekiyor. Bu kelimenin harflerini büyük harflere dönüştüren bir program yazmanızı istiyorum. 

		public static void main(String[] args) {
			Scanner scan= new Scanner(System.in);
			System.out.println("please enter a word");
			String word=scan.nextLine();
			
			System.out.println("new version of the word is "+ word.toUpperCase());
			

		}

}
