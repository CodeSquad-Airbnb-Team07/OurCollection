package interfaces;

public interface List<E> extends Collection<E>{
    E remove(E elem);

    void add(E elem);
}
