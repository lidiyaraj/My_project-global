package project2;

public class Count_ch {

	public static void main(String[] args) {
		String str="BeginnersBook";
		int counter=0;
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)=='B') {
				counter++;
			}
		}
		System.out.println("Char 'B' occured "+counter+" times in the strings");
		
		

	}

}
