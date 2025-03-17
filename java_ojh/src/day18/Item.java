package day18;

import java.util.Date;

import lombok.Data;

@Data
public class Item {
	private Date date;
	private Type type;
	private int money;
}
