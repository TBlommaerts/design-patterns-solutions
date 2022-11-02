package designpatterns.adapter;

import java.time.LocalDateTime;

public interface ITemperatureSensor {
	public double getTemperature(LocalDateTime dateTime);
}