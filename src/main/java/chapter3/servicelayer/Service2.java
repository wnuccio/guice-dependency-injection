package chapter3.servicelayer;

import com.google.inject.Inject;

public class Service2 implements Service {
    private Repository repository2;

    @Inject
    public Service2(@Strategy2 Repository repository2) {
        this.repository2 = repository2;
    }
}
