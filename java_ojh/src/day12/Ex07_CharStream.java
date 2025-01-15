package day12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07_CharStream {

	public static void main(String[] args) {
		
		String fileName = "src/day12/char_stream.txt";
		try(FileReader fr = new FileReader(fileName)){
			while(fr.ready()) {
				char ch = (char)fr.read();
				System.out.print(ch);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없다니까");
		} catch (IOException e) {
			System.out.println("IO 예외라니까");
		}
		
		System.out.println();
		System.out.println("-------------------");
		
		try(FileWriter fw = new FileWriter(fileName)){
			String str = "가나다123";
			fw.write(str);
			fw.flush();
			System.out.println(str + "을 파일에 기록했다요");
		} catch (IOException e) {
			System.out.println("IO 예외라고오");
		}

	}

}
