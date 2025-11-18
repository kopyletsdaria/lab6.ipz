package task2;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Конкретний Ітератор
 */
public class OrderedIterator implements Iterator
{

    private List<Integer> sourceList;
    private int currentPosition = 0;

    public OrderedIterator(OrderedIntegerList list)
    {
        this.sourceList = list.getInnerList();
    }

    @Override
    public boolean hasNext()
    {
        return currentPosition < sourceList.size();
    }

    @Override
    public Integer next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException("У списку більше немає елементів");
        }

        Integer value = sourceList.get(currentPosition);
        currentPosition++;
        return value;
    }
}