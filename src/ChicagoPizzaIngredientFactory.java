public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createSauce() {
        Veggies veggies[] = { new Spinach, new EggPlant, new BlackOlives};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicePepperoni();
    }

    public Clams createClams() {
        return new FrozenClams();
    }
}