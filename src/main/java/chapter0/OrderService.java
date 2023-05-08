package chapter0;

import com.google.inject.Inject;

public class OrderService {
    private PriceService priceService;
    private BuyerService buyerService;
    private ProductService productService;

    @Inject
    public OrderService(
            PriceService priceService,
            BuyerService buyerService,
            ProductService productService
    ) {
        this.priceService = priceService;
        this.buyerService = buyerService;
        this.productService = productService;
    }

    public PriceService price() {
        return priceService;
    }

    public BuyerService buyer() {
        return buyerService;
    }

    public ProductService product() { return productService; }
}
