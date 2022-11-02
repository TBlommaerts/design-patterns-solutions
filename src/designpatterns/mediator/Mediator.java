package designpatterns.mediator;

public interface Mediator {
    void onCloseShutterEvent();
    void onAlarmEvent();
    void registerComponent(Component component);
}
