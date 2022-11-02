package designpatterns.visitor;


public class SoleTrader implements IBusinessEntity {
	
	private final String name;
	
	public SoleTrader(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void doBusiness() {
		System.out.println("Sole trader \"" + name + "\" is doing business.");
	}
	
	@Override
	public void accept(ITaxCalculationVisitor visitor) {
		visitor.visitSoleTrader(this);
	}
}

