package task2;
/**
 * Інтерфейс
 */
public interface Iterator
{
    /**
     * @return true, якщо наступний елемент існує.
     */
    boolean hasNext();
    /**
     * @return Наступне ціле число.
     */
    Integer next();
}