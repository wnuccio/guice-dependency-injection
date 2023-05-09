package chapter4;

public class Service {
    private BuyerService buyerService;

    public Service(BuyerService buyerService) {
        this.buyerService = buyerService;
    }

    public BuyerService buyerService() {
        return buyerService;
    }
}
