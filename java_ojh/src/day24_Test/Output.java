package day24_Test;

import java.io.FileWriter;
import java.io.IOException;

public class Output {

	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("src/day24_Test/test.txt", true);
			fw.write("97\n");
			fw.write("65\n");
			fw.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
