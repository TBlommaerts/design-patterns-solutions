package designpatterns.visitor;


public interface IBusinessEntity {
	
	public String getName();
	
	public void doBusiness();
	
	public void accept(ITaxCalculationVisitor visitor);
}

