package ITWorker;

public class ProgramDeveloper extends ProectWorker implements Developer {
    protected Gradaciya typeWorker;
    public ProgramDeveloper(Gradaciya typeWorker) {
        this.typeWorker = typeWorker;
    }

    @Override
    public void develop(){
        System.out.println("I develop a project");
    }
}
