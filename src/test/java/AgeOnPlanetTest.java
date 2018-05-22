import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AgeOnPlanetTest {



    @Test
    public void earthAgeInSeconds() {
        assertEquals(31, AgeOnPlanet.getEarthAgeInYearsFromSeconds( 1000000000), 0);
    }



}


