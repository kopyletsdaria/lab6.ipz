package task1;
/**
 * Клас для демонстрації сюжету "Втеча Принцеси Фіони"
 */
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("1. Створення вихідної структури замку дракона");
        // Елементи-листи
        SimpleElement princess = new SimpleElement("Принцеса Фіона", "Стан: ув'язнена у вежі");
        SimpleElement key = new SimpleElement("Чарівний Ключ", "Стан: схований");
        SimpleElement guard = new SimpleElement("Дракон", "Стан: патрулює");

        // Композитний елемент(Кімната)
        CompositeElement chamber = new CompositeElement("Вежа Принцеси");
        chamber.addElement(princess);
        chamber.addElement(key);

        // Композитний елемент (Замок)
        CompositeElement castle = new CompositeElement("Замок Дракона");
        castle.addElement(chamber);
        castle.addElement(guard);

        System.out.println("Вихідна структура замку:");
        castle.displayStructure(0);
        System.out.println("...");

        // Глибоке клонування
        System.out.println("2. Глибоке клонування: Фіона створює магічного клона ");
        CompositeElement deepCopy = (CompositeElement) castle.clone(true);
        deepCopy.setName("Глибока копія: сцена порятунку");

        CompositeElement deepCopyChamber = (CompositeElement) deepCopy.getSubElements().get(0);
        SimpleElement deepCopyPrincess = (SimpleElement) deepCopyChamber.getSubElements().get(0);
        deepCopyPrincess.setProperty("Стан: спить на ліжку, чекаючи");

        SimpleElement deepCopyDragon = (SimpleElement) deepCopy.getSubElements().get(1);
        deepCopyDragon.setProperty("Стан: глибоко спить");

        SimpleElement deepCopyKey = (SimpleElement) deepCopyChamber.getSubElements().get(1);
        deepCopyKey.setProperty("Стан: використаний для порятунку");

        System.out.println("\nГлибока копія (сцена після порятунку):");
        deepCopy.displayStructure(0);
        System.out.println("\nОригінал (перевірка: Фіона та дракон зберегли початковий стан):");
        castle.displayStructure(0);

        System.out.println("\nРезультат глибокого клонування:зміна клона (Фіона='спить', дракон='спить') не вплинула на оригінал (Фіона='ув'язнена', Дракон='патрулює'). порятунок успішний!\n");

        // Поверхневе клонування
        System.out.println("3. Поверхневе клонування: спроба створити ілюзію ");

        CompositeElement shallowCopy = (CompositeElement) castle.clone(false);
        shallowCopy.setName("Поверхнева копія: сцена ризику");

        SimpleElement originalDragon = (SimpleElement) castle.getSubElements().get(1);
        originalDragon.setProperty("Стан: атакує вогнем");

        System.out.println("\nПоверхнева копія (після атаки дракона в оригіналі):");
        shallowCopy.displayStructure(0);
        System.out.println("\nОригінал (перевірка: зміна стану дракона):");
        castle.displayStructure(0);

        System.out.println("\nРезультат поверхневого клонування: зміна стану дракона в оригіналі вплинула на копію. Якщо б вони були пов'язані, це ускладнило б порятунок.\n");
    }
}