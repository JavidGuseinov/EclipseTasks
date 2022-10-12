package Homework;

public class StringsDemo2 {

	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel.";
		System.out.println(mesaj);

		String yeniMesaj = mesaj.replace(' ', '-');

		System.out.println(mesaj.replace(' ', '-')); // oldchar yani eski char boşluklarımızı "-" çevirdik.
		System.out.println(yeniMesaj);

		System.out.println(mesaj.substring(2, 10)); // 0,1 ve 2 karakterlerini silip mesajı bastırdı. 2. parametresi ise
													// devam edeceği index

		for (String kelime : mesaj.split(" ")) { // kelimeleri boşluğa göre parça parça ayırdık.
			System.out.println(kelime);
		}

	}
}