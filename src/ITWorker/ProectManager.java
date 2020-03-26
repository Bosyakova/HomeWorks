package ITWorker;

public class ProectManager extends ProectWorker implements Manager {

    @Override
    public void manage() {
        System.out.println("I manage a project");
    }
}
