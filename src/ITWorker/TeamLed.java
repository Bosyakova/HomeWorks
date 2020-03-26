package ITWorker;

public class TeamLed extends ProectWorker implements Manager, Developer {

    @Override
    public void manage(){
        System.out.println("I manage a project");
    }
    @Override
    public void develop(){
        System.out.println("I develop a project");
    }
}
