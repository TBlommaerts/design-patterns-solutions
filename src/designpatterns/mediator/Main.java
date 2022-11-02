package designpatterns.mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new AutomationMediator();

        Alarm alarm = new Alarm();
        Shutter shutter = new Shutter();

        mediator.registerComponent(new Light());
        mediator.registerComponent(new CoffeeMachine());
        mediator.registerComponent(alarm);
        mediator.registerComponent(shutter);

        alarm.triggerAlarm();
        System.out.println();
        shutter.closeShutter();
    }
}
