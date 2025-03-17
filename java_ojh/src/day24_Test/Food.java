package day24_Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Food implements Serializable{

	private static final long serialVersionUID = -1099581751442721668L;
	String name;
	int kcal;
	
	public Food(String name, int kcal) {
		super();
		this.name = name;
		this.kcal = kcal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", kcal=" + kcal + "]";
	}
	
	public void fileSave(String fileName) {
		fileName = "src/day24_Test/food.txt";
		
		
			FileOutputStream oos;
			try {
				oos = new FileOutputStream(fileName);
				try {
					oos.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		
	}
	
	

}
