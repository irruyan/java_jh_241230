package day18;

import java.util.List;

import lombok.Data;

@Data
public class Bank {
	
	//은행, 이름, 계좌번호, 비밀번호
	
	private String bankName;
	private String customerName;
	private int account, password, money;
	
	List<Item2> list; 

}
