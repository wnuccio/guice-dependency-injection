package chapter30;

import chapter30.strategy.StrategyImpl1;
import chapter30.strategy.StrategyImpl2;
import com.google.inject.Inject;

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
