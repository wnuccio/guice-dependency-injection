package chapter5;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class Service {
    private Interface anInterface;

    @Inject
    public Service(Interface anInterface) {
        this.anInterface = anInterface;
    }

    public Interface anInterface() {
        return anInterface;
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(binder ->
                binder.bind(Interface.class).to(InterfaceImpl.class));

        Interface instance = injector.getInstance(Interface.class);

        System.out.println(instance.getClass().getSimpleName());
    }
}
