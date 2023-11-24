import java.sql.SQLOutput;

public class RPGcharacter {
    private String name;
    private int level;
    private int MaxHp;
    private int MaxMana;
    private double damage;
    private double defense;
    private double MaxSpeed;
    private double baseSpeed;
    private double CurrentExp;
    private int MaxExp;
    private double exp;
    private Sword [] sword = new Sword[3];
    private Shield [] shield = new Shield[3];
    private int Swsize;
    private int SHsize;


    RPGcharacter(String name){
        this.name = name;
        level = 1;
        MaxHp = 100;
        MaxMana = 100;
        damage = 50;
        defense = 10;
        baseSpeed = 100;
        MaxSpeed = baseSpeed;
        CurrentExp = exp;
        MaxExp = 500;

    }
    //set default player stat
    public void PrintStatus(){
        System.out.println("+-------------------------------------+");
        System.out.println("[ Status : " + name +" ]");
        System.out.println("+-------------------------------------+");
        System.out.println("Level : " + level);
        System.out.println("Max HP : " + MaxHp);
        System.out.println("Max Mana : " + MaxMana);
        System.out.println("BaseSpeed / MaxSpeed : " + baseSpeed + " / " + MaxSpeed);
        System.out.println("Damage : " + damage);
        System.out.println("Defense : " + defense);
        System.out.println("Exp / MaxEXP : " + CurrentExp + " / " + MaxExp);
        System.out.println("+-------------------------------------+");
        System.out.println("[ Item Storage ]");
        System.out.println("+-------------------------------------+");

        System.out.println("+-------------------------------------+");
    }

    public void LevelUp(){
        level ++;
        MaxExp = MaxExp + 500;
        MaxHp = 100 + (10*level);
        MaxMana = 50 + (2*level);
        MaxSpeed = baseSpeed*(0.1+(0.03*level));
    }
    public void getEXP(double exp){
        this.exp = exp;
        CurrentExp = CurrentExp + exp;
        while (CurrentExp < MaxExp){
            if(CurrentExp >= MaxExp){
                CurrentExp = CurrentExp - MaxExp;
                LevelUp();
            }
            else {
                CurrentExp = CurrentExp + exp;
                break;
            }
        }
    }

    public void PrintAllItem(){
        System.out.printf("%-10s %-10s\n", array[0], array[1]);
        System.out.printf("%-10s %-10s\n", "one", "tdsfwo");
        System.out.printf("%-10s %-10s\n", "onsdfe", "twdfo");
        System.out.printf("%-10s %-10s\n", "odsfne", "twsdfo");
        System.out.printf("%-10s %-10s\n", "osdne", "twdfo");
        System.out.printf("%-10s %-10s\n", "odsfne", "tdfwo");
    }

    public void PrintItemPlayer(){

    }

    public void AddItem(Sword sw){
        if(Swsize > 3){
            System.out.println("Sword full!!");
        }else {
            sword[Swsize] = sw;
            Swsize++;
        }

    }

    public void AddItem(Shield sh){
        if(SHsize > 3){
            System.out.println("Shield full!!");
        }else{
            shield[SHsize] = sh;
            SHsize++;
        }


    }
//    public void Hold(Sword sw){
//        this.sword = sw;
//        damage += sw.IncreaseDmg();
//        baseSpeed -= sw.DecreaseSped(baseSpeed);
//    }
//
//    public void Hold(Shield sh){
//        this.shield = sh;
//        defense += sh.IncreaseDef();
//        baseSpeed -= sh.DecreaseSped(baseSpeed);
//    }
//
//    public void Hold(Sword sw,Shield sh){
//        damage += sw.IncreaseDmg();
//        defense += sh.IncreaseDef();
//        baseSpeed -= sw.DecreaseSped(baseSpeed)+sh.DecreaseSped(baseSpeed);
//    }
//
//    public void Hold(Shield sh,Sword sw){
//        this.Hold(sw,sh);
//    }
}
