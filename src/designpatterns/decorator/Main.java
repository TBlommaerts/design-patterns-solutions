package designpatterns.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        coffee = new MilkCondiment(coffee);
        coffee = new SoyCondiment(coffee);

        System.out.println("Price coffee: " + coffee.cost());
    }
}
