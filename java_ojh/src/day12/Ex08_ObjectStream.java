package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Ex08_ObjectStream {

	public static void main(String[] args) {
		
		String fileName = "src/day12/object_stream.txt";
		
		try(FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			Point p = new Point(1,1);
			oos.writeObject(p);
			
		} catch (FileNotFoundException e) {
			System.out.println("파일 없다고 세번째 말함");
		} catch (IOException e) {
			System.out.println("IO 예외라고 수차례 말함");
		}
		
		try(FileInputStream fis = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(fis)){
			Point p = (Point)ois.readObject();
			System.out.println(p);
		} catch (IOException e) {
			System.out.println("IO 예외 오류쓰");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수가 엄서");
		}

	}

}

@Data
@AllArgsConstructor
class Point implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7450818179758423037L;
	private int x, y;

	@Override
	public String toString() {
		return "(" + x + " , " + y + ")";
	}
	
}