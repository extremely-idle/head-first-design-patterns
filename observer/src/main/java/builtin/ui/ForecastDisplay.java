package builtin.ui;

import builtin.subject.WeatherData;
import bespoke.ui.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by ross.moug on 15/06/2017.
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.2f;
    private float lastPressure;
    private Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        if (currentPressure > lastPressure) {
            System.out.println("Forecast: Improving weather on the way!");
        } else if (currentPressure < lastPressure) {
            System.out.println("Forecast: Watch out for cooler, rainy weather");
        } else {
            System.out.println("Forecast: More of th same");
        }
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
