import handlers.MenuHandler;
import handlers.UserInputHandler;
import models.MovieLibrary;

public class MovieLibraryApplication {
    public static void main(String[] args) {
        MovieLibrary movieLibrary = new MovieLibrary();
        movieLibrary.fillMovieList();

        while(true) {
            MenuHandler.print();
            switch (UserInputHandler.getMenuOptionFromUser()) {
                case DISPLAY_INFORMATION_ABOUT_RANDOM_MOVIE:
                    movieLibrary.getRandomMovieInformation();
                    break;
                case DISPLAY_ACTOR_MOVIES:
                    movieLibrary.printActorFilmography();
                    break;
                case QUIT:
                    System.out.println("Bye-bye!");
                    System.exit(1);
            }
        }

    }
}
