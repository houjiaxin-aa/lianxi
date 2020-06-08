package src.company.chapter09_1.chapter09_2;

public class Main {
    public static void main(String[] args)
    {
        ConcretePrototype1 p1 = new ConcretePrototype1("I");
        ConcretePrototype1 c1 = (ConcretePrototype1) p1.clonePrototype();

        System.out.println("Cloned:" + c1.getId());
    }
}
