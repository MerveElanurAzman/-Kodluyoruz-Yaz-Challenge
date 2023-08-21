package kodluyoruzYazChallenge;

import java.util.Scanner;

public class challenge5medium {

	public static void main(String[] args) {
		//  Kullanıcıdan alınan bir metindeki kelime sayısını hesaplayan bir kod parçacığı yazar mısın?
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a text");
		String text= scan.nextLine();
		int count=1;
		
		for(int i=0;i<text.length();i++)
		{
			char ch=text.charAt(i);
			
			if(ch==' ')
			{
				count++;
			}
			if(ch=='.')
			{
				count++;
			}
			if(ch==',')
			{
				count++;
			}
			
			
		}
		System.out.println("the number of word is " + count);

	}

}
