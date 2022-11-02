package designpatterns.visitor;


public class Company implements IBusinessEntity {

	private final String name;
	
	public Company(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void doBusiness() {
		System.out.println("Company \"" + name + "\" is doing business.");
	}
	
	@Override
	public void accept(ITaxCalculationVisitor visitor) {
		visitor.visitCompany(this);
	}
}