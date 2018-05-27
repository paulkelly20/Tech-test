import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class AgeOnPlanetTest {



    @Test
    public void earthAgeInSeconds() {
        assertEquals(31, AgeOnPlanet.getEarthAgeInYearsFromSeconds( 1000000000), 0);
    }
    @Test
    public void secondsFromYears() {
        assertEquals(31557600, AgeOnPlanet.getSecondsFromYearsOnEarth(10), 0);
    }

    @Test
    public void getAgeOnMercury(){
        assertEquals(41.51, AgeOnPlanet.getAgeOnPlanet(Planet.MERCURY, 10), 0.1);
    }

    @Test
    public void getAgeOnVenus(){
        assertEquals(16.26, AgeOnPlanet.getAgeOnPlanet(Planet.VENUS, 10), 0.1);
    }

    @Test
    public void getAgeOnMars(){
        assertEquals(5.32, AgeOnPlanet.getAgeOnPlanet(Planet.MARS, 10), 0.1);
    }

    @Test
    public void getAgeOnJupiter(){
        assertEquals(0.84, AgeOnPlanet.getAgeOnPlanet(Planet.JUPITER, 10), 0.01);
    }

    @Test
    public void getAgeOnSaturn() {
        assertEquals(0.34, AgeOnPlanet.getAgeOnPlanet(Planet.SATURN, 10), 0.01);
    }

    @Test
    public void getAgeOnUranus() {
        assertEquals(0.119, AgeOnPlanet.getAgeOnPlanet(Planet.URANUS, 10), 0.01);
    }

    @Test
    public void getAgeOnNeptune() {
        assertEquals(0.061, AgeOnPlanet.getAgeOnPlanet(Planet.NEPTUNE, 10), 0.01);
    }

    @Test
    public void getAgeOnPluto() {
        assertEquals(0.040, AgeOnPlanet.getAgeOnPlanet(Planet.PLUTO, 10), 0.01);
    }

    @Test
    public void dateWhen1BillionSecondsOlder(){
        LocalDate birthday =   LocalDate.of(1983, Month.FEBRUARY, 8);
        assertEquals(LocalDate.of(2014, Month.OCTOBER, 17), AgeOnPlanet.dateWhenOneBillionSecondsOlder(birthday));
    }
}


