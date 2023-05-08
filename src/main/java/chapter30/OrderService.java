package chapter30;

import com.google.inject.Inject;
import strategy.Strategy;
import strategy.StrategyImpl1;
import strategy.StrategyImpl2;

public class OrderService {
    private Strategy strategy1;
    private Strategy strategy2;

    @Inject
    public OrderService(
            StrategyImpl1 strategy1,
            StrategyImpl2 strategy2
    ) {
        this.strategy1 = strategy1;
        this.strategy2 = strategy2;
    }

    public Strategy strategy1() {
        return strategy1;
    }

    public Strategy strategy2() {
        return strategy2;
    }
}
