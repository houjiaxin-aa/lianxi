package src.company.chapter09_1.prototype.pro;

public class WuKong {
    public static void main(String[] args)
    {
        Resume a = new Resume("孙悟空");

        Resume b = a.clone();

        Resume c = a.clone();

        a.display();
        b.display();
        c.display();
    }
}
