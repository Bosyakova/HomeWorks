package Arena2;

public class FireMage extends Megician {
    public FireMage() {
        super(20, 0, 95);
    }

    @Override
    public void attack(Warrior1 warrior1) {
        if (cooldown == 0) {
            warrior1.takeDamage(magicAttac);
            mana -= 4;
            cooldown = 3;
        } else {
            warrior1.takeDamage(attack);
            cooldown--;
        }
    }
}

