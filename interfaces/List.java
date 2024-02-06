package interfaces;

public interface List<T> extends Collection<T>{
    T remove(T elem);

    void add(T elem);

    int indexOf(T elem);

    void sort();
}
