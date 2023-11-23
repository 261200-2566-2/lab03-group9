public class RPGcharacter {
    private String name;
    private int level;
    private int MaxHp;
    private int MaxMana;
    private double damage;
    private double defense;
    private double MaxSpeed;
    private double baseSpeed;
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
        MaxExp = 500;

    }
    //set default player stat
}
