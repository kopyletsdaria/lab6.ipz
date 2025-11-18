package task1;
import java.util.List;
/**
 * GameElement - абстрактний клас, визначає загальний інтерфейс
 */
public abstract class GameElement implements Cloneable
{
    private String name;
    public GameElement(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    /**
     * Метод clone() для виконання поверхневого або глибокого копіювання
     */
    public abstract GameElement clone(boolean isDeepCopy);

    @Override
    public String toString()
    {
        return "Елемент [Назва =" + name + ", Тип =" + this.getClass().getSimpleName() + "]";
    }
}
