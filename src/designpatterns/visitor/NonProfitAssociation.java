package designpatterns.visitor;


public class NonProfitAssociation implements IBusinessEntity {

	private final String name;
	
	public NonProfitAssociation(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void doBusiness() {
		System.out.println("Non profit association \"" + name + "\" is doing business.");
	}

	@Override
	public void accept(ITaxCalculationVisitor visitor) {
		visitor.visitNonProfitAssociation(this);
	}
}
