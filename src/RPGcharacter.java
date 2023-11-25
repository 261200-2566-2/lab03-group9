import java.util.Scanner;

public class RPGcharacter {
    private final String name;
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
    private final Sword [] sword = new Sword[3];
    private final Shield [] shield = new Shield[3];
    private int Swsize;
    private Sword currentSword;
    private Shield currentShield;
    private int SHsize;


    RPGcharacter(String name){
        this.name = name;
        level = 1;
        MaxHp = 100;
        MaxMana = 100;
        damage = 50;
        defense = 10;
        MaxSpeed = 100;
        baseSpeed = MaxSpeed;
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
        System.out.println("CurrentSpeed / MaxSpeed : " + baseSpeed + " / " + MaxSpeed);
        System.out.println("Damage : " + damage);
        System.out.println("Defense : " + defense);
        System.out.println("Exp / MaxEXP : " + CurrentExp + " / " + MaxExp);
        System.out.println("+-------------------------------------+");
        System.out.println("[ Current item ]");
        System.out.println("+-------------------------------------+");
        PrintCurrentItem();
        System.out.println("+-------------------------------------+");
    }

    public void LevelUp(){
        level ++;
        System.out.println("Level Up!!!");
        MaxExp = MaxExp + 500;
        MaxHp = 100 + (10*level);
        MaxMana = 50 + (2*level);
        MaxSpeed = MaxSpeed*(0.1+(0.03*level));
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

    public void PrintCurrentItem(){
        if(currentShield != null && currentSword != null){
            System.out.println("Sword: "+ currentSword.getName() + " +" + String.format("%.1f",currentSword.getDamage())+" Dmg");
            System.out.println("Shield: "+ currentShield.getName()+ " +" + String.format("%.1f",currentShield.getDefense())+" Def");
        }else if(currentShield != null){
            System.out.println("Shield: "+ currentShield.getName()+ " +" + String.format("%.1f",currentShield.getDefense())+" Def");
        }else if(currentSword != null){
            System.out.println("Sword: "+ currentSword.getName() + " +" + String.format("%.1f",currentSword.getDamage())+" Dmg");
        }else{
            System.out.println("No item using...");
        }
    }
    public void PrintSword(){
        System.out.println("                      Sword");
        switch (Swsize){
            case 1:
            {
                System.out.println("+--------------------------------------------------------+");
                System.out.printf(" %-17s %-17s %-17s\n","Slot 1", "Slot 2", "Slot 3");
                System.out.println("+--------------------------------------------------------+");
                System.out.printf(" %-20s%-20s%-20s\n", "Name: " + sword[0].getName(), "-", "-");
                System.out.printf(" %-20s%-20s%-20s\n", "Level: "+ sword[0].getLevel(), "-", "-");
                System.out.printf(" %-20s%-20s%-20s\n", "Damage: "+ String.format("%.1f", sword[0].getDamage()), "-", "-");
                System.out.printf(" %-20s%-20s%-20s\n", "Speed: -" +String.format("%.1f",sword[0].DecreaseSped(MaxSpeed)), "-", "-");
                System.out.println("+--------------------------------------------------------+");
                break;
            }
            case 2:
            {
                System.out.println("+--------------------------------------------------------+");
                System.out.printf(" %-20s %-17s %-20s\n","Slot 1", "Slot 2", "Slot 3");
                System.out.println("+--------------------------------------------------------+");
                System.out.printf(" %-20s%-20s%-20s\n", "Name: " + sword[0].getName(), "Name: " + sword[1].getName(), "-");
                System.out.printf(" %-20s%-20s%-20s\n", "Level: "+ sword[0].getLevel(), "Level: "+ sword[1].getLevel(), "-");
                System.out.printf(" %-20s%-20s%-20s\n", "Damage: "+ String.format("%.1f", sword[0].getDamage()), "Damage: "+ String.format("%.1f", sword[1].getDamage()), "-");
                System.out.printf(" %-20s%-20s%-20s\n", "Speed: -" +String.format("%.1f",sword[0].DecreaseSped(MaxSpeed)), "Speed: -" +String.format("%.1f",sword[1].DecreaseSped(MaxSpeed)), "-");
                System.out.println("+--------------------------------------------------------+");
                break;
            }
            case 3:
            {
                System.out.println("+--------------------------------------------------------+");
                System.out.printf(" %-20s %-20s %-20s\n","Slot 1", "Slot 2", "Slot 3");
                System.out.println("+--------------------------------------------------------+");
                System.out.printf(" %-20s%-20s%-20s\n", "Name: " + sword[0].getName(), "Name: " + sword[1].getName(), "Name: " + sword[2].getName());
                System.out.printf(" %-20s%-20s%-20s\n", "Level: "+ sword[0].getLevel(), "Level: "+ sword[1].getLevel(), "Level: "+ sword[2].getLevel());
                System.out.printf(" %-20s%-20s%-20s\n", "Damage: "+ String.format("%.1f", sword[0].getDamage()), "Damage: "+ String.format("%.1f", sword[1].getDamage()), "Damage: "+ String.format("%.1f", sword[2].getDamage()));
                System.out.printf(" %-20s%-20s%-20s\n", "Speed: -" +String.format("%.1f",sword[0].DecreaseSped(MaxSpeed)), "Speed: -" +String.format("%.1f",sword[1].DecreaseSped(MaxSpeed)), "Speed: -" +String.format("%.1f",sword[2].DecreaseSped(MaxSpeed)));
                System.out.println("+--------------------------------------------------------+");
                break;
            }
            default:
            {
                System.out.println("+--------------------------------------------------------+");
                System.out.println("Empty sword slot...");
            }
        }
    }
    public void PrintShield(){
        System.out.println("                      Shield");
        switch (SHsize){
            case 1:
            {
                System.out.println("+--------------------------------------------------------+");
                System.out.printf(" %-17s %-17s %-17s\n","Slot 1", "Slot 2", "Slot 3");
                System.out.println("+--------------------------------------------------------+");
                System.out.printf(" %-20s%-20s%-20s\n", "Name: " + shield[0].getName(), "-", "-");
                System.out.printf(" %-20s%-20s%-20s\n", "Level: "+ shield[0].getLevel(), "-", "-");
                System.out.printf(" %-20s%-20s%-20s\n", "Defense: "+ String.format("%.1f", shield[0].getDefense()), "-", "-");
                System.out.printf(" %-20s%-20s%-20s\n", "Speed: -" +String.format("%.1f",shield[0].DecreaseSped(MaxSpeed)), "-", "-");
                System.out.println("+--------------------------------------------------------+");
                break;
            }
            case 2:
            {
                System.out.println("+--------------------------------------------------------+");
                System.out.printf(" %-20s %-17s %-20s\n","Slot 1", "Slot 2", "Slot 3");
                System.out.println("+--------------------------------------------------------+");
                System.out.printf(" %-20s%-20s%-20s\n", "Name: " + shield[0].getName(), "Name: " + shield[1].getName(), "-");
                System.out.printf(" %-20s%-20s%-20s\n", "Level: "+ shield[0].getLevel(), "Level: "+ shield[1].getLevel(), "-");
                System.out.printf(" %-20s%-20s%-20s\n", "Defense: "+ String.format("%.1f", shield[0].getDefense()), "Defense: "+ String.format("%.1f", shield[1].getDefense()), "-");
                System.out.printf(" %-20s%-20s%-20s\n", "Speed: -" +String.format("%.1f",shield[0].DecreaseSped(MaxSpeed)), "Speed: -" +String.format("%.1f",shield[1].DecreaseSped(MaxSpeed)), "-");
                System.out.println("+--------------------------------------------------------+");
                break;
            }
            case 3:
            {
                System.out.println("+--------------------------------------------------------+");
                System.out.printf(" %-20s %-20s %-20s\n","Slot 1", "Slot 2", "Slot 3");
                System.out.println("+--------------------------------------------------------+");
                System.out.printf(" %-20s%-20s%-20s\n", "Name: " + shield[0].getName(), "Name: " + shield[1].getName(), "Name: " + shield[2].getName());
                System.out.printf(" %-20s%-20s%-20s\n", "Level: "+ shield[0].getLevel(), "Level: "+ shield[1].getLevel(), "Level: "+ shield[2].getLevel());
                System.out.printf(" %-20s%-20s%-20s\n", "Defense: "+ String.format("%.1f", shield[0].getDefense()), "Defense: "+ String.format("%.1f", shield[1].getDefense()), "Defense: "+ String.format("%.1f", shield[2].getDefense()));
                System.out.printf(" %-20s%-20s%-20s\n", "Speed: -" +String.format("%.1f",shield[0].DecreaseSped(MaxSpeed)), "Speed: -" +String.format("%.1f",shield[1].DecreaseSped(MaxSpeed)), "Speed: -" +String.format("%.1f",shield[2].DecreaseSped(MaxSpeed)));
                System.out.println("+--------------------------------------------------------+");
                break;
            }
            default:
            {
                System.out.println("+--------------------------------------------------------+");
                System.out.println("Empty shield slot...");
            }
        }
    }

    public void AddItem(Sword sw){
            sword[Swsize] = sw;
            Swsize++;
            if(Swsize == 3){
                System.out.println("Sword slot full... (3)");
            }
    }

    public void AddItem(Shield sh){
            shield[SHsize] = sh;
            SHsize++;
        if(SHsize == 3){
            System.out.println("Shield slot full... (3)");
        }
    }
    public void CurrentSword(int i){
        if(i < 1 || i > 3){
            System.out.println("Error!!! you enter wrong choice");
            return;
        }
        if(level < sword[i-1].getLevel()){
            System.out.println("Your level not enough to hold this sword");
        }else{
            currentSword = sword[i-1];
            damage += currentSword.IncreaseDmg();
            baseSpeed -= currentSword.DecreaseSped(baseSpeed);
        }

    }

    public void CurrentShield(int i){
        if(i < 1 || i > 3){
            System.out.println("Error!!! you enter wrong choice");
            return;
        }
        if(level < shield[i-1].getLevel()){
            System.out.println("Your level not enough to hold this shield");
        }else{
            currentShield = shield[i-1];
            defense += currentShield.IncreaseDef();
            baseSpeed -= currentShield.DecreaseSped(baseSpeed);
        }

    }
    public void Hold(){
        Scanner sc = new Scanner(System.in);
        System.out.println("You want to hold sword / shield or both?  (sw/sh/bth)");
        System.out.print("Enter answer: ");
        String answer = sc.nextLine();
        Scanner sl = new Scanner(System.in);
        if(answer.equals("bth") || answer.equals("BTH")){
            System.out.println("Select your sword");
            PrintSword();
            System.out.print("Choose sword: ");
            int as = sl.nextInt();
            CurrentSword(as);

            System.out.println("Select your shield");
            PrintShield();
            System.out.print("Choose shield: ");
            int as2 = sl.nextInt();
            CurrentShield(as2);
        }else if(answer.equals("sw") || answer.equals("SW")){
            System.out.println("Select your sword");
            PrintSword();
            System.out.print("Choose sword: ");
            int as = sl.nextInt();
            CurrentSword(as);
        }else if(answer.equals("sh") || answer.equals("SH")){
            System.out.println("Select your shield");
            PrintShield();
            System.out.print("Choose shield: ");
            int as2 = sl.nextInt();
            CurrentShield(as2);
        }else{
            System.out.println("Error!!! you enter wrong choice");
        }
    }


}
