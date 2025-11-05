package mk.ukim.finki.wp.lab.bootstrap;


import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Chef;
import mk.ukim.finki.wp.lab.model.Dish;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Chef> chefs = new ArrayList<>();
    public static List<Dish> dishes = new ArrayList<>();

    @PostConstruct
    public void init() {
        dishes.add(new Dish("1", "Pasta Carbonara", "Italian", 20));
        dishes.add(new Dish("2", "Beef Wellington", "British", 45));
        dishes.add(new Dish("3", "Sushi", "Japanese", 30));
        dishes.add(new Dish("4", "Paella", "Spanish", 40));
        dishes.add(new Dish("5", "Moussaka", "Greek", 50));

        chefs.add(new Chef(1L, "Gordon", "Ramsay", "World-renowned chef with 16 Michelin stars", new ArrayList<>()));
        chefs.add(new Chef(2L, "Jamie", "Oliver", "British chef and restaurateur", new ArrayList<>()));
        chefs.add(new Chef(3L, "Massimo", "Bottura", "Italian chef, owner of Osteria Francescana", new ArrayList<>()));
        chefs.add(new Chef(4L, "Heston", "Blumenthal", "Chef known for molecular gastronomy", new ArrayList<>()));
        chefs.add(new Chef(5L, "Alice", "Waters", "American chef and food activist", new ArrayList<>()));

    }

}
