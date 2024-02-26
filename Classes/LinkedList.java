package Classes;

import interfaces.List;

import java.util.Iterator;

public class LinkedList<T> implements List<T> {
    Node first; // 시작
    Node edge; // 끝
    int size;

    public LinkedList() {
        edge = new Node();
        first = edge;
    }

    @Override
    public int size() {
        return this.size;
    }

    /**
     * 맨 앞에 값을 추가
     * @param elem 추가할 값
     */
    @Override
    public void add(T elem) {
        Node addNode = new Node(elem);
        edge.next = addNode;
        edge = addNode;
    }

    /**
     * 지정 위치에 값을 삽입
     * @param value 값
     * @param index 삽입할 위치
     */
    public void insert(T value, int index) {
        Node now = first;
        for (int i = 0; i < index; i++) {
            now = now.next;
        }
        now.next = new Node(value, now.next);
    }

    /**
     * 지정 위치의 값을 반환
     * @param index 위치
     * @return 값
     */
    public T get(int index){
        Node now = edge;
        for (int i = 0; i < index; i++) {
            now = now.next;
        }
        return now.value;
    }

    /**
     * 첫 번째 해당 값을 제거하고 반환
     * @param elem 제거할 값
     * @return 제거된 값
     */
    @Override
    public T remove(T elem) {
        Node now = edge;
        while (now.value == elem) {
            now = now.next;
        }
        return null;
    }

    /**
     * 해당 위치의 값을 제거하고 반환
     * @param index 제거할 위치
     * @return 제거된 값
     */
    public T remove(int index){
        // 0번 -> first 를 옮김
        // 나머지 -> 그 전의 next 를 next.next
        Node now = first;
        T value;

        if(index == 0) first = first.next;

        for (int i = 0; i < index-1; i++) {
            now = now.next;
        }

        value = now.next.value;
        now.next = now.next.next;

        return value;
    }

    /**
     * 해당 값의 첫 번째 위치를 반환
     * @param elem 값
     * @return 위치
     */
    @Override
    public int indexOf(T elem) {
        Node now = edge;
        int index = 0;
        while (now.value == elem) {
            now = now.next;
            index++;
        }
        return index;
    }

    @Override
    public void sort() {

    }
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains() {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    class Node {
        Node next;
        T value;

        // constructor
        Node() {}
        Node(T value) {this.value = value;}
        Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}

