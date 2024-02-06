package interfaces;

public interface Queue<T> extends Collection<T>{
    void push(T elem);
    T pop();
    T peek();
}
