import java.security.PublicKey;

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
    private Sword sword;
    private Shield shield;

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
        System.out.println("ค่อยทำ");
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

    public void AddItem(Sword sw , Shield sh){
        this.sword = sw;
        this.shield = sh;
    }

}
