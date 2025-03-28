package kr.kh.spring.pagination;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PostCriteria extends Criteria{
	
	private int po_bo_num;
	public PostCriteria() {}
	public PostCriteria(int page, int perPageNum, int po_bo_num) {
		super(page, perPageNum);
	}

	public int getPo_bo_num() {
		return po_bo_num;
	}

	public void setPo_bo_num(int po_bo_num) {
		this.po_bo_num = po_bo_num;
	}
	
}
