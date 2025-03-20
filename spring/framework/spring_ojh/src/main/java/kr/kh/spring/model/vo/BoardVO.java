package kr.kh.spring.model.vo;

import lombok.Data;

@Data
public class BoardVO {
	private int bo_num;
	private String bo_name;
	
	
	public int getBo_num() {
		return bo_num;
	}
	public void setBo_num(int bo_num) {
		this.bo_num = bo_num;
	}
	public String getBo_name() {
		return bo_name;
	}
	public void setBo_name(String bo_name) {
		this.bo_name = bo_name;
	}
	@Override
	public String toString() {
		return "BoardVO [bo_num=" + bo_num + ", bo_name=" + bo_name + "]";
	}
	
	
	
}
