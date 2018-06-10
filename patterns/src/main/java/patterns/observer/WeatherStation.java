package main.java.patterns.observer;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurement(70, 60, 20);
        weatherData.setMeasurement(30, 10, 5);
    }
}
