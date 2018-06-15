package patterns.factory;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(PizzaType type) {
        Pizza pizza = null;

        if (type == PizzaType.CHEESE) {
            pizza = new NYStyleCheesePizza();
        } else if (type == PizzaType.PEPPERONI) {
            pizza = new NYStylePepperoniPizza();
        } else if (type == PizzaType.CLAM) {
            pizza = new NYStyleClamPizza();
        } else if (type == PizzaType.VEGGIE) {
            pizza = new NYStyleVeggiePizza();
        }

        return pizza;
    }
}
