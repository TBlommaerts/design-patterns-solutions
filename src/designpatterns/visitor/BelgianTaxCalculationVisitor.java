package designpatterns.visitor;


public class BelgianTaxCalculationVisitor implements ITaxCalculationVisitor {
	
	@Override
	public void visitSoleTrader(SoleTrader taxSubject) {
		System.out.println("Calculated tax for business entity \"" + taxSubject.getName() + "\" using algorithm for sole traders based on the Belgian tax regulations.");
	}

	@Override
	public void visitCompany(Company taxSubject) {
		System.out.println("Calculated tax for business entity \"" + taxSubject.getName() + "\" using algorithm for companies based on the Belgian tax regulations.");
	}

	@Override
	public void visitNonProfitAssociation(NonProfitAssociation taxSubject) {
		System.out.println("Calculated tax for business entity \"" + taxSubject.getName() + "\" using algorithm for non profit associations based on the Belgian tax regulations.");
	}
}