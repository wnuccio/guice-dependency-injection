package chapter3;

public class Service {
    private PriceService priceService;

    public Service(PriceService priceService) {
        this.priceService = priceService;
    }

    public PriceService priceService() {
        return priceService;
    }
}
