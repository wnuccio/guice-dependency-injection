package chapter0;

import com.google.inject.Inject;

public class ProductServiceImpl implements ProductService {
    private final PriceService priceService;

    @Inject
    public ProductServiceImpl(PriceService priceService) {
        this.priceService = priceService;
    }

}
