package entitiesSec13_1;

public class importedProduct extends Product{
	
	private Double customsFee;
	
	public void ImportedProduct() {
	}

	public importedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return getPrice() + customsFee;
	}

	@Override
	public String priceTag() {
		return getName() +
				" $ " + totalPrice()+
				" (Custos de importação  : " + customsFee + ")";
	}
	
}
