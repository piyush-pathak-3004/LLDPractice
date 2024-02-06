package LLD.FactoryPattern;

public class Client {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory(); 
        PizzaStore store = new PizzaStore(factory);
        store.orderPizza("cheese");
    }
}
