package designpatterns.mediator;

public class Light implements Component {
    public void turnOnLight() {
        System.out.println("Light turns on");
    }

    public void setMediator(Mediator mediator) {
    }

    public String getName() {
        return "light";
    }
}
