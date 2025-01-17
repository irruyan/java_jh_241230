package day13;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Ex03_IOStream {

	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("src/day13/string.txt");
				BufferedReader br = new BufferedReader(fr)){
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("I/O exception");
		}
		
		
		
		try(FileWriter fw = new FileWriter("src/day13/string.txt", true)){
			fw.write("hi. \n");
			fw.write("my name is hong\n");
			
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("I/O exception");
		}
		
		

	}

}
