package Arena2;

import java.util.Random;

public abstract class Warrior1 {
    protected String name;
    protected int attack;
    protected int health;

    public Warrior1(String name, int attack, int health) {
        this.name = name;
        this.attack = attack;
        this.health = health;
    }

    public void takeDamage(int damage) {
        health = health - damage;
    }

    public void attack(Warrior1 warrior) {
        int attack = calculateNextAttack();
        warrior.takeDamage(attack);
    }

    private int calculateNextAttack() {
        int attack = this.attack;
        Random random = new Random();
        int randomNum = random.nextInt(100);
        if (randomNum > 89) {
            attack = attack * 5;
        } else if (randomNum > 70) {
            attack = attack * 2;
        } else if (randomNum < 10) {
            attack = attack / 2;
        }
        return attack;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", health=" + health +
                '}';
    }

    public String toShortString() {
        return name + " have " + health + " left";
    }
}

