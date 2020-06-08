package src.company.chapter09_1.chapter09_4;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男", "29");
        a.setWorkExperience("1998-2000", "XX公司");

        Resume b = a.clone();
        b.setWorkExperience("1998-2006", "YY企业");

        Resume c = a.clone();
        c.setWorkExperience("1998-2003", "ZZ企业");

        a.display();
        b.display();
        c.display();
    }
}
