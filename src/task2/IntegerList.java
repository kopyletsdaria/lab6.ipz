package task2;

/**
 * Інтерфейс
 * Містить фабричний метод createIterator().
 */
public interface IntegerList
{
    void add(int element);
    void remove(int element);
    int get(int index);
    int size();
    Iterator createIterator();
}
