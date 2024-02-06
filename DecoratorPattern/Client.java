package LLD.DecoratorPattern;

import LLD.DecoratorPattern.Pizza.FarmHousePizza;
import LLD.DecoratorPattern.Pizza.Pizza;
import LLD.DecoratorPattern.addOn.SweetCorn;

public class Client {
    public static void main(String[] args) {
        Pizza farmhouse = new FarmHousePizza();
        System.out.println(farmhouse.getCost());

        Pizza farmhouseWithSweetCorn = new SweetCorn(farmhouse);
        System.out.println(farmhouseWithSweetCorn.getCost());
    }
}
