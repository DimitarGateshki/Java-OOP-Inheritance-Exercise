package Restaurant;

import java.math.BigDecimal;

public class MainDish extends Food {
    private double calories;

    public double getCalories() {
        return calories;
    }

    public MainDish(String name, BigDecimal price, double grams, double calories) {
        super(name, price, grams);
        this.calories = calories;
    }
}
