package day23;

import java.io.FileReader;
import java.io.FileWriter;

public class Ex16_IOStream {

	public static void main(String[] args) {
		
		String FileName = "src/day23/ex16.txt";
		/*
		 * FileWriter(파일명) : 기존 파일을 지우고 새로 만듦
		 * FileWriter(파일명, boolean) : true이면 이어쓰기, false이면 새로 만듦
		 */
		try(FileWriter fw = new FileWriter(FileName, true)){
			fw.write("hi\n");
			fw.write("my name is hong\n");
			fw.flush();
		}catch(Exception e) {
			
		}
		
		try(FileReader fr = new FileReader(FileName)){
			while(fr.ready()) {
				char ch = (char) fr.read();
				System.out.print(ch);
			}
		}catch(Exception e) {
			
		}

	}

}
