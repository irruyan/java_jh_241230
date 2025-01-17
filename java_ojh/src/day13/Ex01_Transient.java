package day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Ex01_Transient {

	public static void main(String[] args) {
		
		Point p = new Point(1, 2, 3);
		
		String fileName = "src/day13/point.txt";
		
		try(ObjectInputStream ois 
				= new ObjectInputStream(new FileInputStream(fileName))){
			p = (Point)ois.readObject();
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("I/O exception");
		} catch (ClassNotFoundException e) {
			System.out.println("class not found");
		}
		
		System.out.println(p);
		
		try(ObjectOutputStream oos 
				= new ObjectOutputStream(new FileOutputStream(fileName))){
			oos.writeObject(p);
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("I/O exception");
		}

	}

}


@Data
@AllArgsConstructor
class Point implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5564626764405437214L;

	private int x, y;
	
	private transient int z;
	
}