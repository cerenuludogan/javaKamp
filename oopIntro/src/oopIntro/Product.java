package oopIntro;

public class Product {
	//encapsulation
	private int id;
	private String name;
	private double unitPrices;
	private String detail;
	private double discount;
	
	
	public Product() {
		
	}
	
	public Product(int id, String name, double unitPrices, String detail,double discount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrices = unitPrices;
		this.detail = detail;
		this.discount = discount;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrices() {
		return unitPrices;
	}

	public void setUnitPrices(double unitPrices) {
		this.unitPrices = unitPrices;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrices - (this.unitPrices*this.discount /100);
	}
}
