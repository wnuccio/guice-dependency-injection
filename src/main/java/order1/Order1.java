package order1;

import com.google.inject.Inject;
import strategy.OrderStrategy;
import strategy.Strategy1;
import strategy.Strategy2;

public class Order1 {
    private OrderStrategy strategy1;
    private OrderStrategy strategy2;

    @Inject
    public Order1(
            @Strategy1 OrderStrategy strategy1,
            @Strategy2 OrderStrategy strategy2) {
        this.strategy1 = strategy1;
        this.strategy2 = strategy2;
    }

    public OrderStrategy strategy1() {
        return strategy1;
    }

    public OrderStrategy strategy2() {
        return strategy2;
    }
}
