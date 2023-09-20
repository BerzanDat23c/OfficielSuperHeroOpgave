import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Database database = new Database();
        Controller controller = new Controller(database);

        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Lav en ny superhelt");
            System.out.println("2. Vis listen over superhelte");
            System.out.println("3. Søg efter superhelt");
            System.out.println("4. Afslut programmet");

            int choise = scanner.nextInt();
            scanner.nextLine();

            switch (choise) {
                case 1:
                    controller.createSuperhero(scanner);
                    break;
                case 2:
                    controller.displaySuperheroes();
                    break;
                case 3:
                    controller.searchSuperhero(scanner);

                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Ikke valid valg. Prøv igen");

            }
        }
        System.out.println("Programmet er afsluttet");
        scanner.close();
    }
}