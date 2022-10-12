package Homework;

public class MiniProjectAsalSayi {

	public static void main(String[] args) {

		int number = 1;
		int remainder = number % 2;
		boolean isPrime = true;

		if (number == 1) {
			System.out.println("Asal sayi degildir");
			return;
		}
		if (number < 1) {
			System.out.println("Gecersiz sayi");
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
	}
}