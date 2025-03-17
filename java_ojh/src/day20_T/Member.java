package day20_T;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Member {
	
	private String id;
	private String pw;
	private String authority;
	private List<PurchaseItem> list = new ArrayList<PurchaseItem>();
	
	public Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
		this.authority = "사용자";
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(id, other.id);
	}

	public void addPurchaseItem(PurchaseItem pi) {
		if(pi == null) {
			return;
		}
		list.add(pi);
		
	}

	
	
}
