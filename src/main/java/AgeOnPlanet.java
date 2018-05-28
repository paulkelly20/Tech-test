
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Map;

public class AgeOnPlanet {


    public static double getEarthAgeInYearsFromSeconds(int seconds){
        double result = (seconds / 31557600);
        return result;

    }

    public static double getSecondsFromYearsOnEarth(long age){
        return age * 3155760;

    }

    public static double getAgeOnPlanetFromYears(Planet planet, int age) {
        switch (planet) {
            case MERCURY:
                return age / Planet.MERCURY.getOrbitalPeriod();
            case VENUS:
                return age / Planet.VENUS.getOrbitalPeriod();
            case MARS:
                return age / Planet.MARS.getOrbitalPeriod();
            case JUPITER:
                return age / Planet.JUPITER.getOrbitalPeriod();
            case SATURN:
                return age / Planet.SATURN.getOrbitalPeriod();
            case URANUS:
                return age / Planet.URANUS.getOrbitalPeriod();
            case NEPTUNE:
                return age / Planet.NEPTUNE.getOrbitalPeriod();
            case PLUTO:
                return age / Planet.PLUTO.getOrbitalPeriod();

        }
         return age;
    }

    public static LocalDate dateWhenOneBillionSecondsOlder(LocalDate birthdate){
        long days = (((1000000000 / 60)/60) / 24);
       return birthdate.plus(days, ChronoUnit.DAYS);

    }
}