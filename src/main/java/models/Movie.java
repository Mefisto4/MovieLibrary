package models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Movie {
    private String title;
    private Director director;
    private int productionYear;
    private List<Actor> actorList;
}
