package project2;

public class First_replace {

	public static void main(String[] args) {
		String str=new String("Site is BeginnersBook.com");
		System.out.print("String after replacing com with net:");
		System.out.println(str.replaceFirst("com","net"));
		System.out.println("String after replacing Site name:");
		System.out.println(str.replaceFirst("Beginners(.*)"," XYZ.com"));

	}

}
