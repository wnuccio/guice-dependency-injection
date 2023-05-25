package chapter50;

import com.google.inject.Inject;

public class Service {
    private Repository repository;

    @Inject
    public Service(Repository repository) {
        this.repository = repository;
    }

    public Repository repository() {
        return repository;
    }

    public void findSomething() {
        repository.doSomething();
    }
}
