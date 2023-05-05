package order2;

import com.google.inject.Inject;
import strategy.OrderStrategy;
import strategy.OrderStrategyImpl1;
import strategy.OrderStrategyImpl2;

public class Order2 {
    private OrderStrategy strategy1;
    private OrderStrategy strategy2;

    @Inject
    public Order2(
            OrderStrategyImpl1 strategy1,
            OrderStrategyImpl2 strategy2
    ) {
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
