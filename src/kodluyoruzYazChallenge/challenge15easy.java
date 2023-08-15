package kodluyoruzYazChallenge;

import java.util.Scanner;

public class challenge15easy {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your year of birth:  ");
		int birthYear=scan.nextInt();
		System.out.println("Please, write the current year");
		int currentYear =scan.nextInt();
		
		int age= currentYear-birthYear;
		
		System.out.println("Your age: " + age);
		
		
		
		
		
		
		
	}
}
