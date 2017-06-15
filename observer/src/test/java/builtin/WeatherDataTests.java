package builtin;

import builtin.subject.WeatherData;
import builtin.ui.CurrentConditionsDisplay;
import builtin.ui.ForecastDisplay;
import org.junit.Test;

/**
 * Created by ross.moug on 15/06/2017.
 */
public class WeatherDataTests {

    @Test
    public void basicTest() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
