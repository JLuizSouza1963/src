package entitiesSec13_1;

public class OutsourcedEmployes extends Employee {

	private Double additionalCharge;

	public OutsourcedEmployes() {
		super();
	}
	
	public OutsourcedEmployes(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}