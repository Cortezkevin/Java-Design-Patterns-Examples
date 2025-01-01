package TemplateMethod.example_1;

import TemplateMethod.example_1.template.DrinkTemplate;
import TemplateMethod.example_1.template.MilkDrink;

public class RunApp {
    public static void main(String[] args) {
        DrinkTemplate drinkTemplate = new MilkDrink();
        drinkTemplate.make();
    }
}
