package Arena2;

public class Gladiator extends Warrior1 {
    private int defence = 35;

    public Gladiator(String name) {
        super(name, 30, 100);
    }

    @Override
    public void takeDamage(int damage) {
        if (defence > 0) {
            if (defence >= damage) {
                defence -= damage;
            } else {
                damage = damage - defence;
                health -= damage;
                defence = 0;
            }
        } else {
            health -= damage;
        }
    }

    @Override
    public void attack(Warrior1 warrior) {
        warrior.takeDamage(attack);
    }
}


