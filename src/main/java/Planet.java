public enum Planet {
    VENUS(0.61519726),
    MERCURY(0.2408467),
    MARS(1.8808158),
    JUPITER(11.862615),
    SATURN(29.447498),
    URANUS(84.016846),
    NEPTUNE(164.79132),
    PLUTO(248.00);

    private double orbitalPeriod;

    Planet(double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }
}
