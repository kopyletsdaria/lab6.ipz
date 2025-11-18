package task2;

/**
 * Демонструє створення списку, сортування та обхід через ітератор
 */
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Демонстрація ...");

        System.out.println("1. Створюємо OrderedIntegerList");
        IntegerList myList = new OrderedIntegerList();

        System.out.println("2. Додаємо числа: 10, 2, 50, 5");
        myList.add(10);
        myList.add(2);
        myList.add(50);
        myList.add(5);

        System.out.println("3. Викликаємо фабричний метод createIterator()");
        Iterator myIterator = myList.createIterator();

        System.out.println("4. Обходимо список через ітератор (очікуємо: 2, 5, 10, 50):");

        while (myIterator.hasNext())
        {
            Integer element = myIterator.next();
            System.out.print(element + " ");
        }
        System.out.println("\nКінець обходу");
    }
}