package chapter3.servicelayer;

import com.google.inject.Inject;

public class UseCaseImpl implements UseCase {
    private final Service service1;
    private final Service service2;

    @Inject
    public UseCaseImpl(Service1 service1, Service2 service2) {
        this.service1 = service1;
        this.service2 = service2;
    }

    public Service service1() {
        return service1;
    }

    public Service service2() {
        return service2;
    }
}
