package sof3011.it16307.query;

public abstract class ListQuery extends BaseQuery {

	private Integer offset;
	private Integer maxResult;
	
	public ListQuery() {
		this.offset = 0;
		this.maxResult = 10;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getMaxResult() {
		return maxResult;
	}

	public void setMaxResult(Integer maxResult) {
		this.maxResult = maxResult;
	}
}
