package kodluyoruzYazChallenge;

import java.util.Scanner;

public class challenge5easy {

	public static void main(String[] args) {
		// Kullanıcıdan aldığın iki sayının toplamını ekrana yazdıran bir kod parçacığı yazar mısın?
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter first number");
		int number1=scan.nextInt();
		System.out.println("Please enter second number");
		int number2=scan.nextInt();
		
		int result=number1+number2;
		System.out.println("the result is: "+ result);
		
		
		

	}

}
