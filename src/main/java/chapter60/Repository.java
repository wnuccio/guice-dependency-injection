package chapter60;

public interface Repository {
    default Repository next() { return null; }

    void doSomething();
}
