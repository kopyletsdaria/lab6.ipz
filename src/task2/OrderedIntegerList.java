package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Конкретна реалізація
 */
public class OrderedIntegerList implements IntegerList
{
    private List<Integer> list;
    public OrderedIntegerList()
    {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(int element)
    {
        list.add(element);
        Collections.sort(list);
    }

    @Override
    public void remove(int element)
    {
        list.remove((Integer) element);
    }

    @Override
    public int get(int index)
    {
        return list.get(index);
    }

    @Override
    public int size()
    {
        return list.size();
    }

    /**
     * Реалізація фабричного методу
     */
    @Override
    public Iterator createIterator()
    {
        return new OrderedIterator(this);
    }
    public List<Integer> getInnerList()
    {
        return list;
    }
}