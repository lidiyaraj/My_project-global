package project2;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
public class Readfile_demo {


	public static void main(String[] args) {
		char[] array=new char[100];
		try {
			FileReader input=new FileReader("input.txt");
			input.read(array);
			System.out.println("data in the file");
			System.out.println(array);
			input.close();
		}
		catch (Exception e) {
			e.getStackTrace();
		}

	}

}
