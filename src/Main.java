// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RPGcharacter p1 = new RPGcharacter("Lnwza007");
        Sword s1 = new Sword("Excaliber",10);
        Sword s2 = new Sword("Fire Sword",123);
        Sword s3 = new Sword("Muramasa",55);
        Sword s4 = new Sword("ifusghu",3498);
        p1.AddItem(s1);
        p1.AddItem(s2);
        p1.AddItem(s3);
        //p1.AddItem(s4);
        p1.PrintAllItem();


    }
}