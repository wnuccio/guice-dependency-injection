package order3;

import com.google.inject.Inject;
import strategy.OrderStrategy;

public class OrderStrategyImpl3 implements OrderStrategy {
    private final Repository repository;

    @Inject
    public OrderStrategyImpl3(Repository repository) {
        this.repository = repository;
    }

    public Repository repository() {
        return repository;
    }
}
