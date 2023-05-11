package chapter20;

import chapter20.annotation.Strategy1;
import chapter20.annotation.Strategy2;
import com.google.inject.Inject;

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
