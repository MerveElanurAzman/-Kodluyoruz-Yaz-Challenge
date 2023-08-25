package kodluyoruzYazChallenge;

public class challenge3medium {

	public static void main(String[] args) {
		// Bir mağazada bir kitap 80 TL, bir defter 20 TL ve bir kalem 5 TL. 
		//Bir müşteri 2 kitap, 3 defter ve 4 kalem aldı. Müşteri ne kadar ödeme yapmalı?
		
		
		int book=80;
		int notebook=20;
		int pencil= 5;
		int amount= (2*book)+(3*notebook)+(4*pencil);
		
		System.out.println("Toplam odenecek tutar : " + amount);

	}

}
