package designpatterns.mediator;

public class AutomationMediator implements Mediator {
    private Light light;
    private Alarm alarm;
    private Shutter shutter;
    private CoffeeMachine coffeeMachine;

    public void onCloseShutterEvent() {
        light.turnOnLight();
        coffeeMachine.brewCoffee();
    }

    public void onAlarmEvent() {
        shutter.openShutter();
        coffeeMachine.brewCoffee();
    }
    
    public void registerComponent(Component component) {
        component.setMediator(this);
        switch(component.getName()) {
            case "light":
                light = (Light)component;
                break;
            case "coffee_machine":
                coffeeMachine = (CoffeeMachine)component;
                break;
            case "alarm":
                alarm = (Alarm)component;
                break;
            case "shutter":
                shutter = (Shutter)component;
                break;
        }
    }
}
