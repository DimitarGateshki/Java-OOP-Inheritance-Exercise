package Restaurant;

import java.math.BigDecimal;

public class Starter extends Food {
    private double calories;

    public Starter(String name, BigDecimal price, double grams, double calories) {

        super(name, price, grams);
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }
}
