package handlers;

import java.util.Random;
import models.MovieLibrary;

public class RandomDataProvider {
    static Random random = new Random();

    public static int getRandomMovieIndex() {
        return random.nextInt(MovieLibrary.getMovieList().size());
    }
}
