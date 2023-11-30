
public class Main {
    public static void main(String[] args) {

        RPGcharacter p1 = new RPGcharacter("Lnwza007");
        RPGcharacter p2 = new RPGcharacter("Zoro");
        RPGcharacter p3 = new RPGcharacter("Thorfinn");
        RPGcharacter p4 = new RPGcharacter("Kirito");
        Sword s1 = new Sword("ดาบไทย",20);
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

        p2.AddItem(s2);
        p2.AddItem(s3);

        p4.AddItem(s1);

        //p1.PrintStatus();
        //p2.PrintStatus();
        //p3.PrintStatus();
        //p4.PrintStatus();



//        //test p1 lv up to 25 and try to use Excalibur(lv 25)
        p1.SelectJob();
        p1.getEXP(3000);
//        //p1.Hold();
//        //p1.PrintStatus();
//         p1.PlayWith(p3);
        //p1.SelectJob();

        p2.Attack(p1);
        p1.PrintStatus();
        p1.Heal();
        p1.Heal();
        p1.PrintStatus();
        //test p2 lv up to 2 and try to use Excalibur(lv 25) it can not use because lv lower than sword lv
//        p2.getEXP(1000);
//        p2.Hold();
//        p2.PrintStatus();

        //test p3 try to use item but Empty slot
        //p3.Hold();

        //test p4 have only sword but no shield
        //p4.Hold();
        //p4.PrintStatus();

    }
}