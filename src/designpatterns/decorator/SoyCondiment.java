package designpatterns.decorator;

public class SoyCondiment extends CondimentDecorator {
    
    public SoyCondiment(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.75;
    }
}
