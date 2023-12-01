public class Ring implements Accessories{
    private String name,type;
    private int level;
    private double bonus;

    Ring(String name,int level){
        this.name = name;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void AccUpdateStatus(RPGcharacter player) {
        bonus = 10 * (1+0.7*level);
        player.CurrentAtk += bonus;
    }

    @Override
    public String getBonus() {
        return "Bonus from " + name + " : +"  + String.format("%.1f",bonus);
    }
}
