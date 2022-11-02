package designpatterns.mediator;

public class Alarm implements Component {
    private Mediator mediator;
    
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void triggerAlarm() {
        System.out.println("Alarm rings");
        mediator.onAlarmEvent();
    }
    
    public String getName() {
        return "alarm";
    }
}
