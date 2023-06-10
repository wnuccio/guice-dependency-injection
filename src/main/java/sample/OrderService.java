package sample;

import com.google.inject.Inject;

public class OrderService {

    private DefaultService defaultService;

    @Inject
    public OrderService(DefaultService defaultService) {
        this.defaultService = defaultService;
    }

    public DefaultService internal() {
        return defaultService;
    }
}



