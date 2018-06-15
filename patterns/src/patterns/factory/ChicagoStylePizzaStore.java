package patterns.factory;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(PizzaType type) {
        Pizza pizza = null;

        if (type == PizzaType.CHEESE) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type == PizzaType.PEPPERONI) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if (type == PizzaType.CLAM) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type == PizzaType.VEGGIE) {
            pizza = new ChicagoStyleVeggiePizza();
        }

        return pizza;
    }
}
