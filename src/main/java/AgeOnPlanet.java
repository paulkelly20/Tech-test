public class AgeOnPlanet {


    public static double getEarthAgeInYearsFromSeconds(int seconds){
        double result = (seconds / 31557600);
        return Math.floor(result);

    }

    public static double getSecondsFromYearsOnEarth(int age){
        double result = age * 3155760;
        return result;

    }

    public static double getAgeOnPlanet(Planet planet, int age) {
        switch (planet) {
            case MERCURY:
                return age / 0.2408467;
            case VENUS:
                return age / 0.61519726;
            case MARS:
                return age / 1.8808158;
            case JUPITER:
                return age / 11.862615;
            case SATURN:
                return age / 29.447498;
            case URANUS:
                return age / 84.016846;
            case NEPTUNE:
                return age / 164.79132;
            case PLUTO:
                return age / 248.00;

        }
         return age;
    }
}