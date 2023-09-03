package handlers;

public class MenuHandler {
    public static void print() {
        System.out.println("\nHello adventurer! Available actions:\n");
        System.out.println("- choose 1 to display all information about a random movie\n" +
                "- choose 2 to display all movies where selected actor has played\n" +
                "- choose 3 to quit\n");
        System.out.println("Choose your option wisely:");
    }
}
