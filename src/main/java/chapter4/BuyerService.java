package chapter4;

public class BuyerService {
    private final String name;

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
