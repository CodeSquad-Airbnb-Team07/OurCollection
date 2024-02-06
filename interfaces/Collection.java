package interfaces;

public interface Collection<T> extends Iterable<T>{
    int size();
    void add(T elem);
    T remove(T elem);
    boolean isEmpty();
    boolean contains();

}
