package chapter3;

import com.google.inject.Inject;

public class UseCaseImpl implements UseCase {
    private final Repository repository;

    @Inject
    public UseCaseImpl(Repository repository) {
        this.repository = repository;
    }

    public Repository repository() {
        return repository;
    }
}
