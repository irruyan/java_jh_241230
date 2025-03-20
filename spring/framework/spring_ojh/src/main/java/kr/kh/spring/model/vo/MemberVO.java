package kr.kh.spring.model.vo;

import lombok.Data;

@Data
public class MemberVO {
	private String me_id;
	private String me_pw;
	private String me_email;
	private String me_authority;
	public String getMe_id() {
		return me_id;
	}
	public void setMe_id(String me_id) {
		this.me_id = me_id;
	}
	public String getMe_pw() {
		return me_pw;
	}
	public void setMe_pw(String me_pw) {
		this.me_pw = me_pw;
	}
	public String getMe_email() {
		return me_email;
	}
	public void setMe_email(String me_email) {
		this.me_email = me_email;
	}
	public String getMe_authority() {
		return me_authority;
	}
	public void setMe_authority(String me_authority) {
		this.me_authority = me_authority;
	}
	@Override
	public String toString() {
		return "MemberVO [me_id=" + me_id + ", me_pw=" + me_pw + ", me_email=" + me_email + ", me_authority="
				+ me_authority + "]";
	}
	
	
}
