package task1;
/**
 * SimpleElement - Конкретний клас (Лист)
 */
public class SimpleElement extends GameElement
{

    private String property;

    public SimpleElement(String name, String property)
    {
        super(name);
        this.property = property;
    }

    public String getProperty()
    {
        return property;
    }

    public void setProperty(String property)
    {
        this.property = property;
    }

    /**
     * Для простих елементів використовується поверхневе клонування
     */
    @Override
    public GameElement clone(boolean isDeepCopy)
    {
        try
        {
            return (SimpleElement) super.clone();
        } catch (CloneNotSupportedException e)
        {
            throw new RuntimeException("Помилка клонування SimpleElement", e);
        }
    }

    @Override
    public String toString()
    {
        return super.toString() + ", Властивість='" + property + "'";
    }
}