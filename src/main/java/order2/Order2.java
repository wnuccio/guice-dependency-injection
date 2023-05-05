package order2;

import com.google.inject.Inject;
import strategy.Strategy;
import strategy.StrategyImpl1;
import strategy.StrategyImpl2;

public class Order2 {
    private Strategy strategy1;
    private Strategy strategy2;

    @Inject
    public Order2(
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
