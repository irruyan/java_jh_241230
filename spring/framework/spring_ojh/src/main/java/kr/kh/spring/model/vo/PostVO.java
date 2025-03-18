package kr.kh.spring.model.vo;

import java.util.Date;

import lombok.Data;

@Data
public class PostVO {
	int po_num;
	String po_title, po_content, po_me_id;
	Date po_date;
	int po_view;
	int po_up, po_down;
	int po_bo_num;
	String po_del;
	public int getpo_num() {
		return po_num;
	}
	public void setpo_num(int po_num) {
		po_num = po_num;
	}
	public String getpo_title() {
		return po_title;
	}
	public void setpo_title(String po_title) {
		po_title = po_title;
	}
	public String getpo_content() {
		return po_content;
	}
	public void setpo_content(String po_content) {
		po_content = po_content;
	}
	public String getpo_me_id() {
		return po_me_id;
	}
	public void setpo_me_id(String po_me_id) {
		po_me_id = po_me_id;
	}
	public Date getpo_date() {
		return po_date;
	}
	public void setpo_date(Date po_date) {
		po_date = po_date;
	}
	public int getpo_view() {
		return po_view;
	}
	public void setpo_view(int po_view) {
		po_view = po_view;
	}
	public int getpo_up() {
		return po_up;
	}
	public void setpo_up(int po_up) {
		this.po_up = po_up;
	}
	public int getpo_down() {
		return po_down;
	}
	public void setpo_down(int po_down) {
		this.po_down = po_down;
	}
	public int getpo_bo_num() {
		return po_bo_num;
	}
	public void setpo_bo_num(int po_bo_num) {
		this.po_bo_num = po_bo_num;
	}
	public String getpo_del() {
		return po_del;
	}
	public void setpo_del(String po_del) {
		this.po_del = po_del;
	}
	@Override
	public String toString() {
		return "postVO [po_num=" + po_num + ", po_title=" + po_title + ", po_content=" + po_content + ", po_me_id="
				+ po_me_id + ", po_date=" + po_date + ", po_view=" + po_view + ", po_up=" + po_up + ", po_down="
				+ po_down + ", po_bo_num=" + po_bo_num + ", po_del=" + po_del + "]";
	}
	
	
	
	
	
	
	
}
