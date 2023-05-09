package chapter4;

import com.google.inject.Inject;

public class BuyerService {
    private final String name;

    @Inject
    public BuyerService(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BuyerService{" +
                "name='" + name + '\'' +
                '}';
    }
}
