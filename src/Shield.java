public class Shield {
    private String name;
    private int SHlevel;
    private double defense;


    Shield(String name,int baseDef,int level){
        this.name = name;
        SHlevel = level;
        defense = baseDef*(1+0.5*SHlevel);
    }


    Shield(String name,int baseDef){
        this(name,baseDef,1);
        //set Default level to 1
    }

    public double IncreaseDef(){
        return defense;
    }

    public double DecreaseSped(double baseSped){
        return baseSped*(0.1+0.8*SHlevel);
    }
    public String getName(){
        return name;
    }
    public double getDefense() {return defense; }
}
