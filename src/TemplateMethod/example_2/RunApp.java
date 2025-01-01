package TemplateMethod.example_2;

import TemplateMethod.example_2.template.CevicheFood;
import TemplateMethod.example_2.template.FoodTemplate;
import TemplateMethod.example_2.template.PizzaFood;

public class RunApp {
    public static void main(String[] args) {
        FoodTemplate foodTemplate = new PizzaFood();
        foodTemplate.make();
    }
}
