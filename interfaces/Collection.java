package interfaces;

public interface Collection<T> extends Iterable<T>{
    void add(T elem);

    void delete(T elem);

    void sort();

    int search(T elem);
}
