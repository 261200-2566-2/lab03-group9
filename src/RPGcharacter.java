import java.util.Scanner;

public class RPGcharacter {
    private  String name;
    private int level;
    private int CurrentLevel;
    private int MaxHp;
    private int MaxMana;
    private double damage;
    private double defense;
    private double MaxSpeed;
    private double baseSpeed;
    private double CurrentExp;
    private int MaxExp;
    private Sword[] sword = new Sword[3];
    private Shield[] shield = new Shield[3];
    private int Swsize;
    private Sword currentSword;
    private Shield currentShield;
    private int SHsize;


    RPGcharacter(String name) {
        this.name = name;
        level = 1;
        MaxHp = 100;
        MaxMana = 100;
        damage = 50;
        defense = 10;
        MaxSpeed = 100;
        baseSpeed = MaxSpeed;
        CurrentExp = 0;
        MaxExp = 500;

    }

    //set default player stat
    public void PrintStatus() {
        System.out.println("+-------------------------------------+");
        System.out.println("[ Status : " + name + " ]");
        System.out.println("+-------------------------------------+");
        System.out.println("Level : " + level);
        System.out.println("Max HP : " + MaxHp);
        System.out.println("Max Mana : " + MaxMana);
        System.out.println("CurrentSpeed" + " / " + "MaxSpeed : " + baseSpeed + " / " + MaxSpeed);
        System.out.println("Damage : " + damage);
        System.out.println("Defense : " + defense);
        System.out.println("Exp / MaxEXP : " + CurrentExp + " / " + MaxExp);
        System.out.println("+-------------------------------------+");
        System.out.println("[ Current item ]");
        System.out.println("+-------------------------------------+");
        PrintCurrentItem();
        System.out.println("+-------------------------------------+");
        System.out.println();


    }

    private void LevelUp() {
        CurrentLevel = level;
        level++;
        System.out.println(name + " Level Up!! " + "Level " + CurrentLevel + " --> " + "Level " + level);
        damage += 10 + (0.5 * level);
        defense += 5 + (0.2 * level);
        MaxHp += 100 + (10 * level);
        MaxMana += 50 + (2 * level);
        MaxSpeed += 1.5 * level;
        baseSpeed = MaxSpeed;
    }

    public void getEXP(double exp) {
        CurrentExp = CurrentExp + exp;
        while (exp >= MaxExp) {
            if (CurrentExp >= MaxExp) {
                LevelUp();
                CurrentExp = CurrentExp - MaxExp;
                MaxExp = MaxExp + 500;
            } else {
                CurrentExp = CurrentExp + 0;
                return;
            }
        }
    }


    private void PrintCurrentItem() {
        if (currentShield != null && currentSword != null) {
            System.out.println("Sword: " + currentSword.getName() + " / " + "+" + String.format("%.1f", currentSword.getDamage()) + " Dmg" + " / " + "-" + String.format("%.1f", currentSword.DecreaseSped()) + " Sped");
            System.out.println("Shield: " + currentShield.getName() + " / " + "+" + String.format("%.1f", currentShield.getDefense()) + " Def" + " / " + "-" + String.format("%.1f", currentShield.DecreaseSped()) + " Sped");
        } else if (currentShield != null) {
            System.out.println("Shield: " + currentShield.getName() + " / " + "+" + String.format("%.1f", currentShield.getDefense()) + " Def" + " / " + "-" + String.format("%.1f", currentShield.DecreaseSped()) + " Sped");
        } else if (currentSword != null) {
            System.out.println("Sword: " + currentSword.getName() + " / " + "+" + String.format("%.1f", currentSword.getDamage()) + " Dmg" + " / " + "-" + String.format("%.1f", currentSword.DecreaseSped()) + " Sped");
        } else {
            System.out.println("No item using...");

        }
    }

    private void PrintSword() {
        System.out.println("                      Sword");
        switch (Swsize) {
            case 1: {
                System.out.println("+--------------------------------------------------------+");
                System.out.printf(" %-17s %-17s %-17s\n", "Slot 1", "Slot 2", "Slot 3");
                System.out.println("+--------------------------------------------------------+");
                System.out.printf(" %-20s%-20s%-20s\n", "Name: " + sword[0].getName(), "-", "-");
                System.out.printf(" %-20s%-20s%-20s\n", "Level: " + sword[0].getLevel(), "-", "-");
                System.out.printf(" %-20s%-20s%-20s\n", "Damage: " + String.format("%.1f", sword[0].getDamage()), "-", "-");
                System.out.printf(" %-20s%-20s%-20s\n", "Speed: -" + String.format("%.1f", sword[0].DecreaseSped()), "-", "-");
                System.out.println("+--------------------------------------------------------+");
                break;
            }
            case 2: {
                System.out.println("+--------------------------------------------------------+");
                System.out.printf(" %-20s %-17s %-20s\n", "Slot 1", "Slot 2", "Slot 3");
                System.out.println("+--------------------------------------------------------+");
                System.out.printf(" %-20s%-20s%-20s\n", "Name: " + sword[0].getName(), "Name: " + sword[1].getName(), "-");
                System.out.printf(" %-20s%-20s%-20s\n", "Level: " + sword[0].getLevel(), "Level: " + sword[1].getLevel(), "-");
                System.out.printf(" %-20s%-20s%-20s\n", "Damage: " + String.format("%.1f", sword[0].getDamage()), "Damage: " + String.format("%.1f", sword[1].getDamage()), "-");
                System.out.printf(" %-20s%-20s%-20s\n", "Speed: -" + String.format("%.1f", sword[0].DecreaseSped()), "Speed: -" + String.format("%.1f", sword[1].DecreaseSped()), "-");
                System.out.println("+--------------------------------------------------------+");
                break;
            }
            case 3: {
                System.out.println("+--------------------------------------------------------+");
                System.out.printf(" %-20s %-20s %-20s\n", "Slot 1", "Slot 2", "Slot 3");
                System.out.println("+--------------------------------------------------------+");
                System.out.printf(" %-20s%-20s%-20s\n", "Name: " + sword[0].getName(), "Name: " + sword[1].getName(), "Name: " + sword[2].getName());
                System.out.printf(" %-20s%-20s%-20s\n", "Level: " + sword[0].getLevel(), "Level: " + sword[1].getLevel(), "Level: " + sword[2].getLevel());
                System.out.printf(" %-20s%-20s%-20s\n", "Damage: " + String.format("%.1f", sword[0].getDamage()), "Damage: " + String.format("%.1f", sword[1].getDamage()), "Damage: " + String.format("%.1f", sword[2].getDamage()));
                System.out.printf(" %-20s%-20s%-20s\n", "Speed: -" + String.format("%.1f", sword[0].DecreaseSped()), "Speed: -" + String.format("%.1f", sword[1].DecreaseSped()), "Speed: -" + String.format("%.1f", sword[2].DecreaseSped()));
                System.out.println("+--------------------------------------------------------+");
                break;
            }
            default: {
                System.out.println("+--------------------------------------------------------+");
                System.out.println("Empty sword slot...");
            }
        }
    }

    private void PrintShield() {
        System.out.println("                      Shield");
        switch (SHsize) {
            case 1: {
                System.out.println("+--------------------------------------------------------+");
                System.out.printf(" %-17s %-17s %-17s\n", "Slot 1", "Slot 2", "Slot 3");
                System.out.println("+--------------------------------------------------------+");
                System.out.printf(" %-20s%-20s%-20s\n", "Name: " + shield[0].getName(), "-", "-");
                System.out.printf(" %-20s%-20s%-20s\n", "Level: " + shield[0].getLevel(), "-", "-");
                System.out.printf(" %-20s%-20s%-20s\n", "Defense: " + String.format("%.1f", shield[0].getDefense()), "-", "-");
                System.out.printf(" %-20s%-20s%-20s\n", "Speed: -" + String.format("%.1f", shield[0].DecreaseSped()), "-", "-");
                System.out.println("+--------------------------------------------------------+");
                break;
            }
            case 2: {
                System.out.println("+--------------------------------------------------------+");
                System.out.printf(" %-20s %-17s %-20s\n", "Slot 1", "Slot 2", "Slot 3");
                System.out.println("+--------------------------------------------------------+");
                System.out.printf(" %-20s%-20s%-20s\n", "Name: " + shield[0].getName(), "Name: " + shield[1].getName(), "-");
                System.out.printf(" %-20s%-20s%-20s\n", "Level: " + shield[0].getLevel(), "Level: " + shield[1].getLevel(), "-");
                System.out.printf(" %-20s%-20s%-20s\n", "Defense: " + String.format("%.1f", shield[0].getDefense()), "Defense: " + String.format("%.1f", shield[1].getDefense()), "-");
                System.out.printf(" %-20s%-20s%-20s\n", "Speed: -" + String.format("%.1f", shield[0].DecreaseSped()), "Speed: -" + String.format("%.1f", shield[1].DecreaseSped()), "-");
                System.out.println("+--------------------------------------------------------+");
                break;
            }
            case 3: {
                System.out.println("+--------------------------------------------------------+");
                System.out.printf(" %-20s %-20s %-20s\n", "Slot 1", "Slot 2", "Slot 3");
                System.out.println("+--------------------------------------------------------+");
                System.out.printf(" %-20s%-20s%-20s\n", "Name: " + shield[0].getName(), "Name: " + shield[1].getName(), "Name: " + shield[2].getName());
                System.out.printf(" %-20s%-20s%-20s\n", "Level: " + shield[0].getLevel(), "Level: " + shield[1].getLevel(), "Level: " + shield[2].getLevel());
                System.out.printf(" %-20s%-20s%-20s\n", "Defense: " + String.format("%.1f", shield[0].getDefense()), "Defense: " + String.format("%.1f", shield[1].getDefense()), "Defense: " + String.format("%.1f", shield[2].getDefense()));
                System.out.printf(" %-20s%-20s%-20s\n", "Speed: -" + String.format("%.1f", shield[0].DecreaseSped()), "Speed: -" + String.format("%.1f", shield[1].DecreaseSped()), "Speed: -" + String.format("%.1f", shield[2].DecreaseSped()));
                System.out.println("+--------------------------------------------------------+");
                break;
            }
            default: {
                System.out.println("+--------------------------------------------------------+");
                System.out.println("Empty shield slot...");
            }
        }
    }

    public void AddItem(Sword sw) {
        sword[Swsize] = sw;
        Swsize++;
        if (Swsize == 3) {
            System.out.println(name + " Sword slot full... (3)");
        }
    }

    public void AddItem(Shield sh) {
        shield[SHsize] = sh;
        SHsize++;
        if (SHsize == 3) {
            System.out.println(name + " Shield slot full... (3)");
        }
    }

    private void CurrentSword(int i) {
        if (i < 1 || i > 3) {
            System.out.println("Error!!! you enter wrong choice");
            return;
        }
        if(sword[i-1] == null){
            System.out.println("You can't select empty slot...");
        }else if (level < sword[i - 1].getLevel()) {
            System.out.println("Your level not enough to use this sword");
        }else {
            currentSword = sword[i - 1];
            damage += currentSword.getDamage();
            baseSpeed -= currentSword.DecreaseSped();
        }

    }

    private void CurrentShield(int i) {
        if (i < 1 || i > 3) {
            System.out.println("Error!!! you enter wrong choice");
            return;
        }
        if(shield[i-1] == null){
            System.out.println("You can't select empty slot...");
        }else if (level < shield[i - 1].getLevel()) {
            System.out.println("Your level not enough to use this shield");
        }else {
            currentShield = shield[i - 1];
            defense += currentShield.getDefense();
            baseSpeed -= currentShield.DecreaseSped();
        }

    }

    private void SelectSword() {
        Scanner sl = new Scanner(System.in);
        System.out.println("Select your sword");
        PrintSword();
        System.out.print("Choose sword 1 , 2 , 3 : ");
        int as = sl.nextInt();
        CurrentSword(as);
    }

    private void SelectShield() {
        Scanner sl = new Scanner(System.in);
        System.out.println("Select your shield");
        PrintShield();
        System.out.print("Choose shield 1 , 2 , 3 : ");
        int as2 = sl.nextInt();
        CurrentShield(as2);
    }

    public void Hold() {
        Scanner sc = new Scanner(System.in);
        if ((shield[0] == null) && (sword[0] == null)) {
            System.out.println("Sword and Shield empty...");
        } else if ((shield[0] == null)) {
            System.out.println("Shield empty...");
            System.out.println("You want to use sword instead? (y/n)");
            System.out.print("Enter answer: ");
            String an = sc.nextLine();
            if (an.equals("y") || an.equals("Y")) {
                SelectSword();
            } else if (an.equals("n") || an.equals("N")) {
                System.out.println("Not using any item now");
            } else {
                System.out.println("Error!!! you enter wrong choice");
            }
        } else if ((sword[0] == null)) {
            System.out.println("Sword empty...");
            System.out.println("You want to use shield instead? (y/n)");
            System.out.print("Enter answer: ");
            String an = sc.nextLine();
            if (an.equals("y") || an.equals("Y")) {
                SelectShield();
            } else if (an.equals("n") || an.equals("N")) {
                System.out.println("Not using any item now");
            } else {
                System.out.println("Error!!! you enter wrong choice");
            }
        } else {
            System.out.println("You want to hold sword / shield or both?  (sw/sh/bth)");
            System.out.print("Enter answer: ");
            String answer = sc.nextLine();
            if (answer.equals("bth") || answer.equals("BTH")) {
                SelectSword();
                SelectShield();
            } else if (answer.equals("sw") || answer.equals("SW")) {
                SelectSword();
            } else if (answer.equals("sh") || answer.equals("SH")) {
                SelectShield();
            }else {
                System.out.println("Error!!! you enter wrong choice");
                }
            }
        }
    }
