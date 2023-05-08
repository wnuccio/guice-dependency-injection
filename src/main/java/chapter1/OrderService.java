package chapter1;

import com.google.inject.Inject;
import strategy.Strategy;
import strategy.Strategy1;
import strategy.Strategy2;

public class OrderService {
    private Strategy strategy1;
    private Strategy strategy2;

    @Inject
    public OrderService(
            @Strategy1 Strategy strategy1,
            @Strategy2 Strategy strategy2) {
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
