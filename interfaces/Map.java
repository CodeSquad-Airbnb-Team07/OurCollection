package interfaces;

public interface Map<T, E> extends Collection<T>{
    void put(T key, E value);
    E get(T key);

    T set(E value);
}
