public class Sword {
    private String name;
    private int SWlevel;
    private double damage;
    private double SItemSpeed;

    Sword(String name,int baseDmg,int level){
        this.name = name;
        SWlevel = level;
        damage = baseDmg*(1+0.1*SWlevel);
        SItemSpeed = 100*(1+0.05*SWlevel);
    }

    Sword(String name,int baseDmg){
        this(name,baseDmg,1);
        //set Default level to 1
    }

    public double IncreaseDmg(){
        return damage;
    }

    public double DecreaseSped(double baseSped){
        return baseSped*(0.1+(0.04*SWlevel));
    }

    public String getName(){
        return name;
    }
    public double getDamage() {return  damage; }
    public int getLevel() {return SWlevel;}


}
