package LLD.FactoryPattern;

import LLD.FactoryPattern.Pizza.Pizza;

public class PizzaStore {
    PizzaFactory factory;
    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }
}
