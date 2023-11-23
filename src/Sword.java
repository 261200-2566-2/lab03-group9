public class Sword {
    private String name;
    private int SWlevel;
    private double damage;


    Sword(String name,int baseDmg,int level){
        this.name = name;
        SWlevel = level;
        damage = baseDmg*(1+0.1*SWlevel);
    }

    Sword(String name,int baseDmg){
        this(name,baseDmg,1);
        //set Default level to 1
    }

    public double IncreaseDmg(){
        return damage;
    }

    public double DecreaseSped(double baseSped){
        return baseSped*(0.1+0.4*SWlevel);
    }
}
