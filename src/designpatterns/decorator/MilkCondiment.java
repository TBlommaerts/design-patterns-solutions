package designpatterns.decorator;

public class MilkCondiment extends CondimentDecorator {

    public MilkCondiment(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
    
}
