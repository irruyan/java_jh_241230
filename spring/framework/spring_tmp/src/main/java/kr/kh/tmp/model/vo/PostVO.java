package kr.kh.tmp.model.vo;

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
	String po_bo_name;
	String po_del;
	
	public String getPo_bo_name() {
		return po_bo_name;
	}
	public void setPo_bo_name(String po_bo_name) {
		this.po_bo_name = po_bo_name;
	}
	
	public int getPo_num() {
		return po_num;
	}
	public void setPo_num(int po_num) {
		this.po_num = po_num;
	}
	public String getPo_title() {
		return po_title;
	}
	public void setPo_title(String po_title) {
		this.po_title = po_title;
	}
	public String getPo_content() {
		return po_content;
	}
	public void setPo_content(String po_content) {
		this.po_content = po_content;
	}
	public String getPo_me_id() {
		return po_me_id;
	}
	public void setPo_me_id(String po_me_id) {
		this.po_me_id = po_me_id;
	}
	public Date getPo_date() {
		return po_date;
	}
	public void setPo_date(Date po_date) {
		this.po_date = po_date;
	}
	public int getPo_view() {
		return po_view;
	}
	public void setPo_view(int po_view) {
		this.po_view = po_view;
	}
	public int getPo_up() {
		return po_up;
	}
	public void setPo_up(int po_up) {
		this.po_up = po_up;
	}
	public int getPo_down() {
		return po_down;
	}
	public void setPo_down(int po_down) {
		this.po_down = po_down;
	}
	public int getPo_bo_num() {
		return po_bo_num;
	}
	public void setPo_bo_num(int po_bo_num) {
		this.po_bo_num = po_bo_num;
	}
	public String getPo_del() {
		return po_del;
	}
	public void setPo_del(String po_del) {
		this.po_del = po_del;
	}
	@Override
	public String toString() {
		return "PostVO [po_num=" + po_num + ", po_title=" + po_title + ", po_content=" + po_content + ", po_me_id="
				+ po_me_id + ", po_date=" + po_date + ", po_view=" + po_view + ", po_up=" + po_up + ", po_down="
				+ po_down + ", po_bo_num=" + po_bo_num + ", po_bo_name=" + po_bo_name + ", po_del=" + po_del + "]";
	}
	
	
	
}
