package project2;

import java.io.File;

public class Createfile_demo {

	public static void main(String[] args) {
		File file=new File("newfile.txt");
		try {
			boolean value=file.createNewFile();
			if(value) {
				System.out.println("The new file is created");
			}
			else {
				System.out.println("The file already exists");
			}			
		}
		catch (Exception e) {
			e.getStackTrace();
		}

	}

}
