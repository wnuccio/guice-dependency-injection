package chapter3;

import chapter5.Interface;
import chapter5.InterfaceImpl;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class Service {
    private PriceService priceService;

    @Inject
    public Service(PriceService priceService) {
        this.priceService = priceService;
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector();

        Service instance = injector.getInstance(Service.class);

        System.out.println(instance.getClass().getSimpleName());
    }
}
