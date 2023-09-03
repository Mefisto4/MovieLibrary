package handlers;

import models.Actor;
import models.MenuOptions;

import java.util.Scanner;

public class UserInputHandler {
    private static final Scanner scan = new Scanner(System.in);

    public static MenuOptions getMenuOptionFromUser() {
        return MenuOptions.values()[getSelectedOptionFromUser() - 1];
    }

    public static Actor getActorFromUser() {
        System.out.println("Type an actor: ");
        String[] actors = scan.nextLine().split(" ");
        return new Actor(actors[0], actors[1]);
    }

    private static int getIntegerFromUser() {
        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.println("It is not an integer. Try again!");
        }
        return scan.nextInt();
    }

    private static int getSelectedOptionFromUser() {
        int result = getIntegerFromUser();
        scan.nextLine();
        if (result > 0 && result < MenuOptions.values().length + 1) {
            return result;
        } else {
            System.out.println("Non-existing option: " + result);
            return getSelectedOptionFromUser();
        }
    }

}
