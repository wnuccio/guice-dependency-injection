package chapter5;

import com.google.inject.Inject;

public class Service {
    private Interface anInterface;

    @Inject
    public Service(Interface anInterface) {
        this.anInterface = anInterface;
    }

    public Interface anInterface() {
        return anInterface;
    }
}
