package a1_ProcessingInMemoryData;

import java.time.LocalDate;

public class Sale {
	private String product;
	private LocalDate date;
	private int amount;

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Sale(String product, LocalDate date, int amount) {
		super();
		this.product = product;
		this.date = date;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Sale [product=" + product + ", date=" + date + ", amount=" + amount + "]";
	}

}
