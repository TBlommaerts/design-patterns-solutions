package designpatterns.adapter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * We have an application that is able to measure the heat on mechanical components based on sensor data.
		 * Currently, our company produces 2 types of sensors, which both measure the temperature in degrees Celsius.
		 */
		ITemperatureSensor sensor1 = new Sensor1();
		ITemperatureSensor sensor2 = new Sensor2();
		
		HeatChecker heatChecker = new HeatChecker();
		
		LocalDateTime timeToCheck = LocalDateTime.of(LocalDate.of(2022, 10, 30), LocalTime.of(15, 52, 43, 452));
		
		boolean sensor1Overheated = heatChecker.isOverheated(sensor1, timeToCheck);
		boolean sensor2Overheated = heatChecker.isOverheated(sensor2, timeToCheck);
		
		System.out.println("Sensor 1 was overheated on " + timeToCheck.toString() + " : " + sensor1Overheated + ".");
		System.out.println("Sensor 2 was overheated on " + timeToCheck.toString() + " : " + sensor2Overheated + ".");
		
		/*
		 *  We also want to support the use of third party sensors.
		 *  The sensor below is defined in an external library, which we don't have control over.
		 *  It comes from an American manufacturer, so everything is measure in degrees Fahrenheit
		 */
		ThirdPartySensor sensor3 = new ThirdPartySensor();
		
		ITemperatureSensor sensor3Adapter = new ThirdPartySensorAdapter(sensor3);
		
		boolean sensor3Overheated = heatChecker.isOverheated(sensor3Adapter, timeToCheck);
		
		System.out.println("Sensor 3 was overheated on " + timeToCheck.toString() + " : " + sensor3Overheated + ".");
	}
}