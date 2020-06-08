package src.company.chapter09_1;

public class Main {
    public static void main(String[] args){
        Resume a=new Resume("大鸟");
        a.setPersonalInfo("男","29");
        a.setWorkExperience("1998-2000","XX公司");

        /*Resume b=new Resume("小菜");
        b.setPersonalInfo("女","27");
        b.setWorkExperience("1999-2001","XX公司");

        Resume c=new Resume("菜鸟");
        c.setPersonalInfo("男","30");
        c.setWorkExperience("2000-2005","XX公司");*/

        Resume b=a;
        Resume c=a;

        a.display();
        b.display();
        c.display();
    }
}
