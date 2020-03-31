package BoxAndCatHomework;

import java.util.Random;

public class Box {
    public boolean open = false;

    public Box(Cat cat) {
        cat.alive = cat.getAlive();
    }

    public boolean getOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Box box = new Box(cat);
        box.openBox(cat);
        box.catAliveProbability(cat);


    }

    public void openBox(Cat cat) {
        Random random = new Random();
        int randomNum = random.nextInt(2);
        open = true;
        if (randomNum > 0) {
            cat.alive = true;
            System.out.println("Кот жив");
        } else {
            cat.alive = false;
            System.out.println("Кот мёртв");
        }
    }
    int catAliveProbability;
       public void catAliveProbability(Cat cat) {
        if ((open) && (cat.alive)) {
            catAliveProbability = 100;
        }
        if ((open) && (!cat.alive)) {
            catAliveProbability = 0;
        }
        if ((cat.alive) && (!open)) {
            catAliveProbability = 50;
        }
        System.out.println("Cat Alive Probability:" + catAliveProbability);
        }
    }
