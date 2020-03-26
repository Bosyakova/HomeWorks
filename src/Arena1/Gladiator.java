package Arena1;

import java.util.Random;

public class Gladiator {
        private String name;
        private int attack;
        private int health;

        public Gladiator(String name, int attack, int health) {
            this.name = name;
            this.attack = attack;
            this.health = health;
        }

        public void takeDamage(int damage) {
            health = health - damage;
        }

        public void attack(Gladiator gladiator) {
            gladiator.takeDamage(attack);
        }
        public int calculateNextAttack(){
            int attack = this.attack;
            Random random = new Random();
            int randomNum = random.nextInt(100);
            if(randomNum < 89) {
                attack = attack - 2;
            }else if (randomNum<10){
                attack=attack/2;
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
            return "Gladiator{" +
                    "name='" + name + '\'' +
                    ", attack=" + attack +
                    ", health=" + health +
                    '}';
        }

    public String toShortString() {
            return name + " have " + health + " left";
        }
    }

