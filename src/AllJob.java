public class AllJob implements Job{
    @Override
    public void UpdateStatus(String name, RPGcharacter player) {
        if(name.equals("Swordman")){
            player.name = "Swordman";
            player.job = name;
            player.MaxHp += (int) (250*(1+0.01*player.getLevel()));
            player.CurrentHp = player.MaxHp;
            player.defense += 125*(1+0.01*player.getLevel());
            player.MaxMana += (int) (70*(1+0.01*player.getLevel()));
            player.CurrentMana = player.MaxMana;
            player.MaxSpeed += 100*(1+0.01*player.getLevel());
            player.baseSpeed = player.MaxSpeed;
            player.damage += 200*(1+0.01*player.getLevel());
        }else if(name.equals("Archer")){
            player.name = "Archer";
            player.job = name;
            player.MaxSpeed += 20*(1+0.01*player.getLevel());
            player.baseSpeed = player.MaxSpeed;
            player.damage += 30*(1+0.01*player.getLevel());
        }

    }

}
