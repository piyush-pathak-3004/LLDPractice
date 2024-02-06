package LLD.FactoryPattern;

import LLD.FactoryPattern.Pizza.Pizza;
import LLD.FactoryPattern.Pizza.SweetCornPizza;
import LLD.FactoryPattern.Pizza.cheesePizza;

public class PizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")) {
            pizza = new cheesePizza();
        } else if(type.equals("sweetCorn")) {
            pizza = new SweetCornPizza();
        }
        return pizza;
    }
}