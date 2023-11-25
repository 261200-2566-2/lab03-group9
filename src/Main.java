
public class Main {
    public static void main(String[] args) {
        RPGcharacter p1 = new RPGcharacter("Lnwza007");
        Sword s1 = new Sword("Excalibur",12);
        Sword s2 = new Sword("Fire Sword",123);
        Sword s3 = new Sword("ดาบไทย",1000,100);

        Shield sh1 = new Shield("LO1",33);
        Shield sh2 = new Shield("sDD",430,123);
        Shield sh3 = new Shield("Shield Po",12);

        p1.AddItem(s1);
        p1.AddItem(s2);
        p1.AddItem(s3);
        p1.AddItem(sh1);
        p1.AddItem(sh2);
        p1.AddItem(sh3);

        //p1.Hold();
        //p1.PrintStatus();
        p1.getEXP(3200);
        p1.PrintStatus();
    }
}