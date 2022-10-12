package Homework;

public class StringsDemo1 {

	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel.";
		System.out.println(mesaj);

		System.out.println("Eleman sayısı:" + mesaj.length());
		System.out.println("5.eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!"));

		System.out.println(mesaj.startsWith("b"));
		System.out.println(mesaj.endsWith("."));

		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);

		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("e"));
	}
}