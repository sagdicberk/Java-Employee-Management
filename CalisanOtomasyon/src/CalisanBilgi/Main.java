package CalisanBilgi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calisan teknikCalisan = new Calisan(1985, 45, 2000, "kemal");
		Calisan muhasebeRECEPCalisan = new Calisan(1990, 60, 2500, "RECEP");
		Calisan yaz�l�mCalisan = new Calisan(2014, 90, 1500, "Berk");
		yaz�l�mCalisan.summary();
		teknikCalisan.summary();
		muhasebeRECEPCalisan.summary();
		
		
		
		
	}

}
