public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza; // --> it's not a concreate class, because we don't know what kind of type will
                     // be

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);

}