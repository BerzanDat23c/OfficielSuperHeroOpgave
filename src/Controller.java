import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Controller {
    private final Database database;

    public Controller(Database database) {
        this.database = database;
    }

    public void createSuperhero(Scanner scanner) {
        System.out.println  ("Skriv superheltensnavn:");
        String name = scanner.nextLine();

        System.out.println("Skriv rigtige navn:");
        String superpower = scanner.nextLine();

        System.out.println("Skriv superkræftr:");
       String superpower = scanner.nextLine();

        System.out.println("Skriv skabelsesår");
        int creationsYear = scanner.nextInt();

        System.out.println("Skriv styrke (1-10):");
        int strength = scanner.nextInt();
        scanner.nextLine();

        Superhero newSuperhero = new Superhero(name, realName, Superpower, creationYear, strength);
        database.addSuperhero(newSuperhero);
        System.out.println("Superhelten er blevet tilføjet til databasen");
    }

    public void displaySuperheroes() {
        List<Object> superheroes = database.getSuperheroes();
        if (superheroes.isEmpty()) {
            System.out.println("Der er ingen superhelte i databasen");
        } else {
            System.out.println("Liste over superhelte");
            for (Object superhero : superheroes) System.out.println(superhero.toString());
        }
    }

    public void searchSuperhero(Scanner scanner) {
        System.out.println("Skriv superheltnavn eller del af navnet:");
        String searchName = scanner.nextLine();
        Object superhero = database.searchSuperhero(searchName);
        if (superhero != null) {
            System.out.println("Superheltoplysninger:");
            System.out.println(superhero.toString());
        } else {
            System.out.println("Superhelten blev ikke fundet i databasen.");
        }
    }

    private class Superhero {
        public Superhero(String name, String realName, String superpower, int creationYear, int strength) {
        }
    }
}
