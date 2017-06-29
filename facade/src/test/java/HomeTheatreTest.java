import facade.HomeTheatreFacade;
import objects.*;
import org.junit.Test;

/**
 * Created by ross.moug on 29/06/2017.
 */
public class HomeTheatreTest {

    @Test
    public void test() {
        Amplifier amp = new Amplifier();
        CdPlayer cd = new CdPlayer();
        DvdPlayer dvd = new DvdPlayer();
        PopcornPopper popcornPopper = new PopcornPopper();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheatreLights lights = new TheatreLights();
        Tuner tuner = new Tuner();

        HomeTheatreFacade facade = new HomeTheatreFacade(amp, tuner, dvd, cd, projector, screen, lights, popcornPopper);

        facade.watchMovie("Lord of the Rings: The Fellowship of the Ring");
        facade.endMovie();
    }
}
