package designpatterns.mediator;

public class CoffeeMachine implements Component {
    public void brewCoffee() {
        System.out.println("Coffee starts brewing");
    }   

    public void setMediator(Mediator mediator) {
    }

    public String getName() {
        return "coffee_machine";
    }
}
