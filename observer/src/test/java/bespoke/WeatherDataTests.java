package bespoke;

        import org.junit.Test;
        import bespoke.subject.WeatherData;
        import bespoke.ui.CurrentConditionsDisplay;

/**
 * Created by ross.moug on 15/06/2017.
 */
public class WeatherDataTests {

    @Test
    public void basicTest() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
