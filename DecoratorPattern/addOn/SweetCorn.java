package LLD.DecoratorPattern.addOn;

import LLD.DecoratorPattern.Pizza.Pizza;

public class SweetCorn implements Pizza {
    Pizza pizza;
    public SweetCorn(Pizza pizza) {
        this.pizza = pizza;
    }
    public int getCost() {
        return pizza.getCost() + 50;
    }
}
