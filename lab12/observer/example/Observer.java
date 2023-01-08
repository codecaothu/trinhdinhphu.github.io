package lab12.observer.example;

public abstract class Observer {
    public Subject subject;

    public abstract void update();
}
