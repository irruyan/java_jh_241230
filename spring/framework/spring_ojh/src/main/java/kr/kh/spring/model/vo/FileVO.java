package kr.kh.spring.model.vo;

import lombok.Data;

@Data
public class FileVO {
	
	private int fi_num;
	private String fi_ori_name;
	private String fi_name;
	private int fi_po_num;
	
	public FileVO() {}

	public FileVO(String fi_ori_name, String fi_name, int fi_po_num) {
		super();
		this.fi_ori_name = fi_ori_name;
		this.fi_name = fi_name;
		this.fi_po_num = fi_po_num;
	}


	public int getFi_num() {
		return fi_num;
	}

	public void setFi_num(int fi_num) {
		this.fi_num = fi_num;
	}

	public String getFi_ori_name() {
		return fi_ori_name;
	}

	public void setFi_ori_name(String fi_ori_name) {
		this.fi_ori_name = fi_ori_name;
	}

	public String getFi_name() {
		return fi_name;
	}

	public void setFi_name(String fi_name) {
		this.fi_name = fi_name;
	}

	public int getFi_po_num() {
		return fi_po_num;
	}

	public void setFi_po_num(int fi_po_num) {
		this.fi_po_num = fi_po_num;
	}

	@Override
	public String toString() {
		return "FileVO [fi_num=" + fi_num + ", fi_ori_name=" + fi_ori_name + ", fi_name=" + fi_name + ", fi_po_num="
				+ fi_po_num + "]";
	}
	
	
	
	
	
}
