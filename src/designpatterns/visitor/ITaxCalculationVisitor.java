package designpatterns.visitor;


public interface ITaxCalculationVisitor {
	
	public void visitSoleTrader(SoleTrader taxSubject);
	
	public void visitCompany(Company taxSubject);
	
	public void visitNonProfitAssociation(NonProfitAssociation taxSubject);
}