import handlers.MenuHandler;
import handlers.UserInputHandler;

import java.util.Scanner;

public class MovieLibraryApplication {
    public static void main(String[] args) {

        MenuHandler.print();
        switch (UserInputHandler.getMenuOptionFromUser()) {
            case DISPLAY_INFORMATION_ABOUT_RANDOM_MOVIE:
                // todo
                break;
            case DISPLAY_ACTOR_MOVIES:
                // todo
                break;
            case QUIT:
                System.out.println("Bye-bye!");
                System.exit(1);
        }
    }
}

//The Shawshank Redemption (1994) - Directed by Frank Darabont
//
//Tim Robbins
//Morgan Freeman
//Bob Gunton
//Pulp Fiction (1994) - Directed by Quentin Tarantino
//
//John Travolta
//Samuel L. Jackson
//Uma Thurman
//The Godfather (1972) - Directed by Francis Ford Coppola
//
//Marlon Brando
//Al Pacino
//James Caan
//The Dark Knight (2008) - Directed by Christopher Nolan
//
//Christian Bale
//Heath Ledger
//Aaron Eckhart
//Forrest Gump (1994) - Directed by Robert Zemeckis
//
//Tom Hanks
//Robin Wright
//Gary Sinise
//Inception (2010) - Directed by Christopher Nolan
//
//Leonardo DiCaprio
//Joseph Gordon-Levitt
//Ellen Page
//Schindler's List (1993) - Directed by Steven Spielberg
//
//Liam Neeson
//Ralph Fiennes
//Ben Kingsley
//The Lord of the Rings: The Return of the King (2003) - Directed by Peter Jackson
//
//Elijah Wood
//Ian McKellen
//Viggo Mortensen
//The Matrix (1999) - Directed by The Wachowskis (Lana and Lilly Wachowski)
//
//Keanu Reeves
//Laurence Fishburne
//Carrie-Anne Moss
//Titanic (1997) - Directed by James Cameron
//
//Leonardo DiCaprio
//Kate Winslet
//Billy Zane