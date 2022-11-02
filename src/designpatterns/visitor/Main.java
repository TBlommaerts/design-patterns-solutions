package designpatterns.visitor;


public class Main {
	
	public static void main(String[] args) {
		
		ITaxCalculationVisitor belgianTaxCalculationVisitor = new BelgianTaxCalculationVisitor();
		ITaxCalculationVisitor germanTaxCalculationVisitor = new GermanTaxCalculationVisitor();

		IBusinessEntity soleTrader = new SoleTrader("Kruidenierszaak De Bolle");
		IBusinessEntity company = new Company("Volkswagen");
		IBusinessEntity nonProfit = new NonProfitAssociation("Greenpeace");
		
		IBusinessEntity[] businessEntities = new IBusinessEntity[] {soleTrader, company, nonProfit};
		
		for (IBusinessEntity businessEntity : businessEntities) {
			
			// Do your business
			businessEntity.doBusiness();
			
			// Business is done: time for taxes
			businessEntity.accept(belgianTaxCalculationVisitor);
			businessEntity.accept(germanTaxCalculationVisitor);
		}
	}
}