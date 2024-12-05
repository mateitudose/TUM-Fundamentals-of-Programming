package de.tum.cit.fop;

public class Container<T> {
    private int count;
    private T content;

    public Container(int count, T content) {
        this.count = count;
        this.content = content;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
