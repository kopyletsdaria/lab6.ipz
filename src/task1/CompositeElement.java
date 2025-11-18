package task1;

import java.util.ArrayList;
import java.util.List;

/**
 * CompositeElement - Конкретний клас (Композит)
 */
public class CompositeElement extends GameElement
{

    private List<GameElement> subElements;

    public CompositeElement(String name)
    {
        super(name);
        this.subElements = new ArrayList<>();
    }

    public void addElement(GameElement element)
    {
        this.subElements.add(element);
    }

    public List<GameElement> getSubElements()
    {
        return subElements;
    }

    /**
     * @param isDeepCopy true для глибокого клонування, false для поверхневого.
     */
    @Override
    public GameElement clone(boolean isDeepCopy)
    {
        CompositeElement clonedElement;
        try
        {
            clonedElement = (CompositeElement) super.clone();
        } catch (CloneNotSupportedException e)
        {
            throw new RuntimeException("Помилка клонування CompositeElement", e);
        }

        if (isDeepCopy)
        {
            List<GameElement> clonedSubElements = new ArrayList<>();
            for (GameElement element : this.subElements)
            {
                clonedSubElements.add(element.clone(true));
            }
            clonedElement.subElements = clonedSubElements;
        } else
        {
            clonedElement.subElements = new ArrayList<>(this.subElements);
        }

        return clonedElement;
    }
    public void displayStructure(int depth)
    {
        String indent = "  ".repeat(depth);
        System.out.println(indent + "-> " + this.toString());
        for (GameElement element : subElements)
        {
            if (element instanceof CompositeElement)
            {
                ((CompositeElement) element).displayStructure(depth + 1);
            } else
            {
                System.out.println(indent + " ... " + element.toString());
            }
        }
    }
}