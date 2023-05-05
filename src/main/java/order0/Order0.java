package order0;

import com.google.inject.Inject;

public class Order0 {
    private Price price;
    private Buyer buyer;
    private Product product;

    @Inject
    public Order0(
            Price price,
            Buyer buyer,
            Product product
    ) {
        this.price = price;
        this.buyer = buyer;
        this.product = product;
    }

    public Price price() {
        return price;
    }

    public Buyer buyer() {
        return buyer;
    }

    public Product product() { return product; }
}
