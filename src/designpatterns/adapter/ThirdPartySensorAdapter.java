package designpatterns.adapter;

import java.time.LocalDateTime;

public class ThirdPartySensorAdapter implements ITemperatureSensor {

	private ThirdPartySensor sensor;
	
	public ThirdPartySensorAdapter(ThirdPartySensor sensor) {
		this.sensor = sensor;
	}
	
	@Override
	public double getTemperature(LocalDateTime dateTime) {
		/*
		 * Call interface specific method name, convert method arguments, and convert the return value.
		 */
		double fahrenheit = sensor.fetchTemperature(dateTime.getYear(), dateTime.getMonth().ordinal(), dateTime.getDayOfMonth(), 
				dateTime.getHour(), dateTime.getMinute(), dateTime.getSecond(), dateTime.getNano());
		
		return convertFahrenheitToCelsius(fahrenheit);
	}
	
	private double convertFahrenheitToCelsius(double fahrenheit) {
		return ((fahrenheit - 32) * 5) / 9; 
	}
}