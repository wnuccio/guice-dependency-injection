package order0;

import com.google.inject.Inject;

public class ProductImpl implements Product {
    private final Price price;

    @Inject
    public ProductImpl(Price price) {
        this.price = price;
    }

}
