package CalisanBilgi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calisan teknikCalisan = new Calisan(1985, 45, 2000, "Mustafa");
		Calisan muhasebeCalisan = new Calisan(1990, 60, 2500, "Kemal");
		Calisan yazilimCalisan = new Calisan(2014, 90, 1500, "Oguz");
		yazilimCalisan.summary();
		teknikCalisan.summary();
		muhasebeCalisan.summary();
		
		
		
		
	}

}
