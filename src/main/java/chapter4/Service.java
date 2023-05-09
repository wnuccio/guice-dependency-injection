package chapter4;

import com.google.inject.Inject;

public class Service {
    private BuyerService buyerService;

    @Inject
    public Service(BuyerService buyerService) {
        this.buyerService = buyerService;
    }

    public BuyerService buyerService() {
        return buyerService;
    }
}
