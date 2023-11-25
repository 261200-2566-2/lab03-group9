
public class Main {
    public static void main(String[] args) {
        RPGcharacter p1 = new RPGcharacter("Lnwza007");
        Sword s1 = new Sword("ดาบไทย",20,1);
        Sword s2 = new Sword("Muramasa",110,9);
        Sword s3 = new Sword("Excalibur",1000,25);

        Shield sh1 = new Shield("The Scutum",40,2);
        Shield sh2 = new Shield("Kite Shield",100,12);
        Shield sh3 = new Shield("The Aegis",450,25);

        p1.AddItem(s1);
        p1.AddItem(s2);
        p1.AddItem(s3);
        p1.AddItem(sh1);
        p1.AddItem(sh2);
        p1.AddItem(sh3);

        p1.getEXP(5000);
        p1.Hold();
        p1.PrintStatus();

    }
}