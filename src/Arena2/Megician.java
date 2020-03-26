package Arena2;

abstract class Megician extends Warrior1 {
    public int mana;
    public int cooldown;
    public int magicAttac;

    public Megician(int mana, int cooldown, int magicAttac) {
        super("Mag", 3, 120);
        this.mana = mana;
        this.cooldown = cooldown;
        this.magicAttac = magicAttac;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getCooldown() {
        return cooldown;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }

    public int getMagicAttac() {
        return magicAttac;
    }

    public void setMagicAttac(int magicAttac) {
        this.magicAttac = magicAttac;
    }

    @Override
    public String toString() {
        return "Megician {" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", health=" + health +
                ", mana=" + mana +
                ", cooldown=" + cooldown +
                ", magicAttack=" + magicAttac +
                '}';
    }
}

