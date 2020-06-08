package src.company.chapter09_1.prototype.pro;

public class Resume implements Cloneable
{
    private String	name;
    public Resume(String name)
    {
        this.name = name;
    }
    public void display()
    {
        System.out.println(name);
    }
    public Resume clone()
    {
        Resume obj = new Resume(name);
        return obj;
    }
}

