package kr.kh.spring.model.vo;

import java.util.Date;

import lombok.Data;

@Data
public class CommentVO {
	int co_num;
	String co_content; 
	Date co_date;
	int co_ori_num; 
	String co_del;
	String co_me_id; 
	int co_po_num;
	public int getCo_num() {
		return co_num;
	}
	public void setCo_num(int co_num) {
		this.co_num = co_num;
	}
	public String getCo_content() {
		return co_content;
	}
	public void setCo_content(String co_content) {
		this.co_content = co_content;
	}
	public Date getCo_date() {
		return co_date;
	}
	public void setCo_date(Date co_date) {
		this.co_date = co_date;
	}
	public int getCo_ori_num() {
		return co_ori_num;
	}
	public void setCo_ori_num(int co_ori_num) {
		this.co_ori_num = co_ori_num;
	}
	public String getCo_del() {
		return co_del;
	}
	public void setCo_del(String co_del) {
		this.co_del = co_del;
	}
	public String getCo_me_id() {
		return co_me_id;
	}
	public void setCo_me_id(String co_me_id) {
		this.co_me_id = co_me_id;
	}
	public int getCo_po_num() {
		return co_po_num;
	}
	public void setCo_po_num(int co_po_num) {
		this.co_po_num = co_po_num;
	}
	@Override
	public String toString() {
		return "CommentVO [co_num=" + co_num + ", co_content=" + co_content + ", co_date=" + co_date + ", co_ori_num="
				+ co_ori_num + ", co_del=" + co_del + ", co_me_id=" + co_me_id + ", co_po_num=" + co_po_num + "]";
	}
	
	
}
