package designpatterns.mediator;

public class Shutter implements Component {
    private Mediator mediator;
    
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void openShutter() {
        System.out.println("Shutter opens");
    }

    public void closeShutter() {
        System.out.println("Shutter closes");
        mediator.onCloseShutterEvent();
    }
    
    public String getName() {
        return "shutter";
    }
}
