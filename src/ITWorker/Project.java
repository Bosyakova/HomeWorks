package ITWorker;

public class Project {
    private ITWorker[] people;

    public Project(ITWorker... people) {
        this.people = people;
    }

    public void make(ITWorker[] people) {
        for (ITWorker itWorker : people) {
            if (itWorker instanceof CoffeeMaker) {
                CoffeeMaker coffeeMaker = (CoffeeMaker) itWorker;
               coffeeMaker.makeCoffee();

                }

            }
        }

    }

