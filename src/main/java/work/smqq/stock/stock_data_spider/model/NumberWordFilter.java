package work.smqq.stock.stock_data_spider.model;

public class NumberWordFilter {
	private String word;
	private Double startValue;
	private Double endValue;
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public Double getStartValue() {
		return startValue;
	}
	public void setStartValue(double startValue) {
		this.startValue = startValue;
	}
	public Double getEndValue() {
		return endValue;
	}
	public void setEndValue(double endValue) {
		this.endValue = endValue;
	}
}
