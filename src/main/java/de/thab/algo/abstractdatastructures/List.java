package de.thab.algo.abstractdatastructures;

public interface List<T> {
    void add(T element);
    T get(int index);
    void remove(int index);
    int size();
    boolean isEmpty();
}