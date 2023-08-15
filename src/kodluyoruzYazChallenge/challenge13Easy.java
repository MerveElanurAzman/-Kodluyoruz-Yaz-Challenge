package kodluyoruzYazChallenge;

import java.util.Scanner;

public class challenge13Easy {
	// Kullanıcıdan bir sayı almanızı ve bu sayının asal olup olmadığını kullanıcıya söylemenizi istiyorum. 

	public static void main(String[] args) {
			
			Scanner scan=new Scanner(System.in);
			System.out.println("please enter a number");
			int number=scan.nextInt();
			if(number>0)
			{
			boolean result=isPrimeNumber(number);
			if(result==true)
			{
				System.out.println(number+" is a prime number ");
			}
			if(result==false)
			{
				System.out.println(number+" is not a prime number ");
			}
			}
			else
			{
				System.out.println("please enter a positive number");
			}
			

		}
		
		public static boolean isPrimeNumber(int number)
		{
			boolean result=true;
			
				if(number==1)
				{
					result= false;
				}
				
				else if (number==2)
				{
					result= true;
				}
				
				for(int i=2;i<number;i++)
				{
					if(number%i==0)
					{
						result= false;
						break;
					}
					else 
						result=true;
				}
			
			return result;
		
		}

}
