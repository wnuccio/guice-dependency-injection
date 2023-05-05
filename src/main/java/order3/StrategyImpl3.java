package order3;

import com.google.inject.Inject;
import strategy.Strategy;

public class StrategyImpl3 implements Strategy {
    private final Repository repository;

    @Inject
    public StrategyImpl3(Repository repository) {
        this.repository = repository;
    }

    public Repository repository() {
        return repository;
    }
}
