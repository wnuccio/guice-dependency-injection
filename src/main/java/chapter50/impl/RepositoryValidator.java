package chapter50.impl;

import chapter50.Repository;
import com.google.inject.Inject;

public class RepositoryValidator implements Repository {
    private Repository repository;

    @Inject
    public RepositoryValidator(Repository repository) {
        this.repository = repository;
    }

    @Override
    public Repository next() {
        return repository;
    }

    @Override
    public void doSomething() {
        System.out.println("do validation!");
        repository.doSomething();
    }
}
