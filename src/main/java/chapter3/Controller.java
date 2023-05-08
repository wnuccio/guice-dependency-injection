package chapter3;

import com.google.inject.Inject;

public class Controller {
    private final UseCase useCase;

    @Inject
    public Controller(UseCase useCase) {
        this.useCase = useCase;
    }

    public UseCase useCase() {
        return useCase;
    }
}