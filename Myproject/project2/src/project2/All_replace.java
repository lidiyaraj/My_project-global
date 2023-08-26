package project2;

public class All_replace {

	public static void main(String[] args) {
	    String str=new String("My .com site is BeginnersBook.com");
	    System.out.println("String after replacing all com with net:");
	    System.out.println(str.replaceAll("com","net"));
	    System.out.println("Replacing whole String:");
	    System.out.println(str.replaceAll("(.*)Beginners(.*)","Welcome"));

	}

}

