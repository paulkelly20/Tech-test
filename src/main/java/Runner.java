import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        System.out.println("Press 1 to Calculate Age On Other Planets" + System.lineSeparator() +
                "Press 2 to Calculate Earth years from seconds"+ System.lineSeparator() +
                "Press 3 to Calculate Seconds from Earth years" + System.lineSeparator() +
                "Press 4 to Find out the date when you're a Billion seconds old");
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();


        if (selection == 1) {

            System.out.println(
                    "Pick Your Planet:" + System.lineSeparator() +
                            "Press 1 for Mercury " + System.lineSeparator() +
                            "Press 2 for Venus" + System.lineSeparator() +
                            "Press 3 for Mars" + System.lineSeparator() +
                            "Press 4 for Jupiter" + System.lineSeparator() +
                            "Press 5 for Saturn" + System.lineSeparator() +
                            "Press 6 for Uranus" + System.lineSeparator() +
                            "Press 7 for Neptune" + System.lineSeparator() +
                            "Press 8 for the \"Planet\" Pluto"

            );
            int planetSelection = scanner.nextInt();
            System.out.println("What is your Age?");
            int ageSelection = scanner.nextInt();
            Planet planet = getPlanetEnumFromSelection(planetSelection);
            String pickedPlanet = planet.toString().substring(0,1).toUpperCase() + planet.toString().substring(1).toLowerCase();
            System.out.println(String.format("You are %s years old on %s", AgeOnPlanet.getAgeOnPlanetFromYears(planet, ageSelection), pickedPlanet));
        }

        if (selection == 2) {
            System.out.println("How many seconds?");
            int secondsSelection = scanner.nextInt();
            System.out.println(String.format("You are %d years old", (long)AgeOnPlanet.getEarthAgeInYearsFromSeconds(secondsSelection)));
        }

        if (selection == 3) {
            System.out.println("How many Years?");
            int yearsSelection = scanner.nextInt();
            System.out.println(String.format("You are %d Seconds old", (long)AgeOnPlanet.getSecondsFromYearsOnEarth(yearsSelection)));
        }

        if (selection == 4) {
            System.out.println("Enter date of birth in the format dd/mm/yyyy");
            String dateLine = scanner.next();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
            LocalDate dateOfBirth = LocalDate.parse(dateLine, formatter);
            DateTimeFormatter formatters = DateTimeFormatter.ofPattern("d/MM/uuuu");
            LocalDate result = AgeOnPlanet.dateWhenOneBillionSecondsOlder(dateOfBirth);
            String formattedResult = result.format(formatters);
            if(LocalDate.now().isBefore(result)){
            System.out.println(String.format("The date will be %s when you are 1 Billion Seconds old", formattedResult ));}
            else System.out.println(String.format("The date when you were 1 Billion Seconds old was %s", formattedResult ));}

    }








    public static Planet getPlanetEnumFromSelection(int selection) {
        switch (selection) {
            case 1:
                return Planet.MERCURY;
            case 2:
                return Planet.VENUS;
            case 3:
                return Planet.MARS;
            case 4:
                return Planet.JUPITER;
            case 5:
                return Planet.SATURN;
            case 6:
                return Planet.URANUS;
            case 7:
                return Planet.NEPTUNE;
            case 8:
                return Planet.PLUTO;

        }
        return null;

    }

}
