package work.smqq.stock.stock_data_spider.model;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

public class StockFilter {
	private Integer pageSize;
	private Integer pageNum; 
	private String stockCode; 
	private String searchKey;
	private String sortOrder;
	private String sortProp;
	private Integer peStart; 
	private Integer peEnd;
	private String boardCode;
	private Boolean collected;
	private List<NumberWordFilter> numberWordFilterList;
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getSearchKey() {
		return searchKey;
	}
	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}
	public String getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}
	public String getSortProp() {
		return sortProp;
	}
	public void setSortProp(String sortProp) {
		this.sortProp = sortProp;
	}
	public Integer getPeStart() {
		return peStart;
	}
	public void setPeStart(Integer peStart) {
		this.peStart = peStart;
	}
	public Integer getPeEnd() {
		return peEnd;
	}
	public void setPeEnd(Integer peEnd) {
		this.peEnd = peEnd;
	}
	public List<NumberWordFilter> getNumberWordFilterList() {
		return numberWordFilterList;
	}
	public void setNumberWordFilterList(List<NumberWordFilter> numberWordFilterList) {
		this.numberWordFilterList = numberWordFilterList;
	}
	public String getBoardCode() {
		return boardCode;
	}
	public void setBoardCode(String boardCode) {
		this.boardCode = boardCode;
	}
	public Boolean getCollected() {
		return collected;
	}
	public void setCollected(Boolean collected) {
		this.collected = collected;
	}
}
