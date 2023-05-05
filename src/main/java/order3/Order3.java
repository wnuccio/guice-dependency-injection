package order3;

import com.google.inject.Inject;
import strategy.OrderStrategy;

public class Order3 {
    private final OrderStrategy strategy;

    @Inject
    public Order3(OrderStrategy strategy) {
        this.strategy = strategy;
    }

    public OrderStrategy strategy() {
        return strategy;
    }
}
