package chapter30;

import com.google.inject.Inject;

public class OrderService {
    private Strategy strategy1;
    private Strategy strategy2;

    @Inject
    public OrderService(
            Strategy strategy1,
            Strategy strategy2
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
