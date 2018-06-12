package patterns.decorator;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage expresso = new Expresso();

        System.out.println(expresso.getDescription() + " $" + expresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        houseBlend = new Mocha(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());

        Beverage decaf = new Decaf();
        decaf = new Whip(decaf);
        decaf = new Mocha(decaf);
        System.out.println(decaf.getDescription() + " $" + decaf.cost());
    }
}
