package models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Movie {
    private String title;
    private Director director;
    private List<Actor> actorList;

    public List<Actor> getListOfActors() {
        return actorList;
    }
}
