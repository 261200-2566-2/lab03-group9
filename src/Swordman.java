public class Swordman implements Job{
    RPGcharacter player;

    Swordman(RPGcharacter player){
        this.player = player;
        player.job = "Swordman";
    }

    @Override
    public void UpdateStatus() {
        player.MaxHp += (int) (250*(1+0.01*player.getLevel()));
        player.CurrentHp = player.MaxHp;
        player.defense += 125*(1+0.01*player.getLevel());
        player.MaxMana += (int) (70*(1+0.01*player.getLevel()));
        player.CurrentMana = player.MaxMana;
        player.MaxSpeed += 100*(1+0.01*player.getLevel());
        player.baseSpeed = player.MaxSpeed;
        player.damage += 200*(1+0.01*player.getLevel());
    }

    @Override
    public void Skill(boolean cooldown) {
        if(cooldown){
            player.CurrentMana -= 100*(1+0.04*player.getLevel());
            System.out.println("Skill: Blade Cyclone!!!");
            player.CurrentAtk += 100*(1+0.06*player.getLevel());
        }else{
            System.out.println("cooldown skill...");
        }

    }
}

