package LLD.FactoryPattern.Pizza;

public class cheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing cheese Pizza with extraaaa cheese....");
    }

    @Override
    public void bake() {
        System.out.println("baking cheese Pizza....");
    }

    @Override
    public void box() {
        System.out.println("boxing cheese Pizza....");
    }
    
}
