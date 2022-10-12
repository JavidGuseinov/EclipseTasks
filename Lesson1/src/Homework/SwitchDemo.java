package Homework;

public class SwitchDemo {

	public static void main(String[] args) {
		char grade = 'F';

		switch (grade) {
		case 'A':
			System.out.println("Mukemmel : Gectiniz");
			break;

		case 'B':
			System.out.println("Cok Güzel : Gectiniz");
			break;

		case 'C':
			System.out.println("İyi : Gectiniz");
			break;

		case 'D':
			System.out.println("Fean degil : Gectiniz");
			break;

		case 'F':
			System.out.println("Maalesef Kaldiniz");
			break;
		default:
			System.out.println("Geçersiz Not Girdiniz.");

		}
	}
}