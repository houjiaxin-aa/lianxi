package src.company.chapter09_1.chapter09_2;

public class ConcretePrototype1 extends Prototype
{
    public ConcretePrototype1(String id)
    {
        super(id);
    }

    public Prototype clonePrototype()
    {
        try
        {
            return (Prototype) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
