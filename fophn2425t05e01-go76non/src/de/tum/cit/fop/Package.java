package de.tum.cit.fop;

public class Package<T> {
    private final T item;

    public Package(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
