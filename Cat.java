import java.util.Random;

public class Cat {
    public static String name;
    public static int dexterity;
    public static int strength;
    public static int iq;
    public static int hp;
    public static Gameplay gameplay;

    public Cat(String name, int dexterity, int strength, int iq, int hp, Gameplay gameplay) {
        this.name = name;
        this.dexterity = dexterity;
        this.strength = strength;
        this.iq = iq;
        this.hp = hp;
        this.gameplay = gameplay;
    }

    public void hunt() {
        System.out.println("Hunt");
    }

    public int kick() {
        Random random = new Random();
        int randomNumber = random.nextInt(21); 
        int ttl_dmg = randomNumber + this.dexterity;
        return ttl_dmg;
    }

    public int bite() {
        Random random = new Random();
        int randomNumber = random.nextInt(21); 
        int ttl_dmg = randomNumber + this.strength;
        return ttl_dmg;
    }

    public int escape() {
        Random random = new Random();
        int randomNumber = random.nextInt(21); 
        int ttl_IQ = randomNumber + this.iq;
        return ttl_IQ;
    }

    public void scratch() {
        System.out.println("The cats collectively scratches on the rug");
    }

    public void talk(String message) {
        System.out.println(message);
    }

    public String getName() {
        return this.name;
    }

    public int getDexterity() {
        return this.dexterity;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getIQ() {
        return this.iq;
    }

    public int getHP() {
        return this.hp;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    public int updateHP() {
        if (gameplay.dexBattle() == 2 || gameplay.strengthBattle() == 2 || gameplay.iqBattle() == 2){
            return this.hp--;
        }else{
            return this.hp;
        }
    }
}
