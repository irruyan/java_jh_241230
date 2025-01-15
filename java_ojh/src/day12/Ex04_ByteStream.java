package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.plaf.synth.SynthToggleButtonUI;

public class Ex04_ByteStream {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		/*
		 * 
		 */
		
		try{
			fis = new FileInputStream("src/day12/byte_stream.txt");
			
			int data;
			do {
				data = fis.read();
				if(data != -1) {
					System.out.print((char)data);
				}
				
			}while(data != -1);
			
		}catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("읽기에 실패했습니다.");
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}


