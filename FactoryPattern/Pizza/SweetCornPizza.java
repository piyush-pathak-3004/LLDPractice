package LLD.FactoryPattern.Pizza;

public class SweetCornPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("preparing pizza with extraaa sweet corns.........");
    }

    @Override
    public void bake() {
        System.out.println("baking pizza with extraaa sweet corns.........");
    }

    @Override
    public void box() {
        System.out.println("boxing pizza with extraaa sweet corns.........");
    }
    
}
