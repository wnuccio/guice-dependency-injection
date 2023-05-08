package chapter40.servicelayer;

import com.google.inject.Inject;

public class Service1 implements Service {
    private Repository repository1;

    @Inject
    public Service1(@Strategy1 Repository repository1) {
        this.repository1 = repository1;
    }
}
