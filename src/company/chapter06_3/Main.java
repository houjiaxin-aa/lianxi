package src.company.chapter06_3;

public class Main {
    public static void main(String[] args){
        Person person = new Person("小菜");
        System.out.println("第一种装扮：");

        Sneakers pqx = new Sneakers();
        BigTrouser kk = new BigTrouser();
        TShirts dtx = new TShirts();

        pqx.decorate(person);
        kk.decorate(pqx);
        dtx.decorate(kk);
        dtx.show();

        System.out.println("第二种装扮：");

        LeatherShoes px =new LeatherShoes();
        Tie ld = new Tie();
        Suit xz = new Suit();

        px.decorate(person);
        ld.decorate(px);
        xz.decorate(ld);
        xz.show();


        System.out.println("第三种装扮：");

        Sneakers pqx2 = new Sneakers();
        LeatherShoes px2 = new LeatherShoes();
        BigTrouser kk2 = new BigTrouser();
        Tie ld2 = new Tie();

        pqx2.decorate(person);
        px2.decorate(pqx2);
        kk2.decorate(px2);
        ld2.decorate(kk2);

        ld2.show();
    }
}
