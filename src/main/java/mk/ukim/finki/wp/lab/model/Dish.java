package mk.ukim.finki.wp.lab.model;

import lombok.Data;

@Data
public class Dish {
    String dishId;
    String name;
    String cuisine;
    int preparationTime;

    public Dish(String dishId, String name, String cuisine, int preparationTime) {
        this.dishId = dishId;
        this.name = name;
        this.cuisine = cuisine;
        this.preparationTime = preparationTime;
    }
}
