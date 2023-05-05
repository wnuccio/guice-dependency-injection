package order3;

import com.google.inject.Inject;
import strategy.Strategy;

public class Order3 {
    private final Strategy strategy;

    @Inject
    public Order3(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy strategy() {
        return strategy;
    }
}
