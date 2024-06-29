package CalisanBilgi;

public class Calisan {
	private String name;
	public double salary;
	private int workHours, HireYear;
	
	
	public Calisan(int HireYear, int workHours, double salary, String name) {
		// TODO Auto-generated constructor stub
		this.HireYear = HireYear;
		this.workHours = workHours;
		this.salary = salary;
		this.name = name;
	}
	
	public double vergi() {
		if (this.salary <= 1000) {
			return 0.0;
		}else {
			return (this.salary*3)/100;	
		}
		
	}
	
	public double bonus() {
		int ekstra = this.workHours - 40;
		if (ekstra > 0) {
			return (ekstra * 30);
		}else {
			return 0;
		}
		
	}
	
	public double increment() {
		int workyear= 2015 - this.HireYear;
		if (workyear < 10) {
			return ( this.salary * 5 ) / 100;
		}else if (workyear > 9 && workyear < 20) {
			return ( this.salary * 10 ) / 100;
		} else {
			return ( this.salary * 15 ) / 100;
		}
	}
	
	public void summary() {
		System.out.println("!------------------------!");
		System.out.println("isim :" + this.name);
		System.out.println("maa� :" + this.salary);
		System.out.println("�al��ma saati :" + this.workHours);
		System.out.println("�� ba�lang�� tarihi :" + this.HireYear);
		System.out.println("vergi :" + this.vergi());
		System.out.println("art�� :" + this.increment());
		double guncelMaas = (this.salary - this.vergi() + this.bonus());
		System.out.println("bonus de�eri : " + this.bonus());
		System.out.println("G�ncel maa� :" + guncelMaas);
		System.out.println("zaml� maa� :"+ (this.salary + this.increment()));
	}
	

}
