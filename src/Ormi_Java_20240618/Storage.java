package Ormi_Java_20240618;

public interface Storage <T>{

    void add(T item, int index);

    T get(int index);
}
