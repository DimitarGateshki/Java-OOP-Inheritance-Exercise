package Restaurant;

import java.math.BigDecimal;

public class Cake extends Dessert {
    protected final static double CAKE_GRAMS=250;
    protected final static double CAKE_CALORIES=1000;
    protected final static BigDecimal CAKE_PRICE=BigDecimal.valueOf(5);

    public Cake(String name) {
        super(name, CAKE_PRICE, CAKE_GRAMS, CAKE_CALORIES);
    }
}
