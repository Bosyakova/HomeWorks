package Arena1;

import java.util.ArrayList;
import java.util.Random;

    public class Arena {
        public ArrayList<Gladiator> abc = new ArrayList<>();
        public static void main(String[] args) throws InterruptedException {
            Random random = new Random();
            Gladiator gladiator1 = new Gladiator("Timur", random.nextInt(30), random.nextInt(200) + 1);
            Gladiator gladiator2 = new Gladiator("Katia", random.nextInt(30), random.nextInt(200) + 1);
            System.out.println(gladiator1);
            System.out.println(gladiator2);

            while (gladiator1.isAlive() && gladiator2.isAlive()) {
                Thread.sleep(3000);
                gladiator1.attack(gladiator2);
                gladiator2.attack(gladiator1);
                System.out.println(gladiator1.toShortString());
                System.out.println(gladiator2.toShortString());
            }
            if (gladiator1.isAlive()) {
                System.out.println(gladiator1.getName() + " is a winner");
            } else {
                System.out.println(gladiator2.getName() + " is a winner");
            }
        }
    }

