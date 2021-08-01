
public class BestSeller {
	private String title;
	private String desc;
	private int price;
	
	public BestSeller() {}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BestSeller [title=" + title + ", desc=" + desc + ", price=" + price + "]";
	}
	
	
}
