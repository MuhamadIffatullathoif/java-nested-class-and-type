package org.iffat.nested_classes.burger;

import org.iffat.nested_classes.domain.Employee;
import org.iffat.nested_classes.domain.StoreEmployee;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public static void main(String[] args) {
        Meal regularMeal = new Meal();
        regularMeal.addToppings("Ketchup", "Mayo", "Bacon", "Cheddar");
        System.out.println(regularMeal);

        Meal USRegularMeal = new Meal(0.65);
        System.out.println(USRegularMeal);
    }
}
