package chapter60.impl;

import chapter60.Repository;
import com.google.inject.Inject;

public class RepositoryLogger implements Repository {

    private Repository repository;

    @Inject
    public RepositoryLogger(Repository repository) {
        this.repository = repository;
    }

    @Override
    public Repository next() {
        return repository;
    }

    @Override
    public void doSomething() {
        System.out.println("do logging!");
        repository.doSomething();
    }
}
