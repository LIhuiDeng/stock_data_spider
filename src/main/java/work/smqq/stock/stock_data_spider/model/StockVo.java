package work.smqq.stock.stock_data_spider.model;

public class StockVo extends Stock {
	 private boolean collected;
	 private String remark;
	public boolean isCollected() {
		return collected;
	}
	public void setCollected(boolean collected) {
		this.collected = collected;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
