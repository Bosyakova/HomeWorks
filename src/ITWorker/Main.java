package ITWorker;

public class Main {
    public static void main(String[] args) {
        ITWorker[] people = {
                new Stager(),
                new TeamLed(),
                new QATester(),
                new ProectManager(),
                new ProgramDeveloper(Gradaciya.JUNIOR),
                new ProgramDeveloper(Gradaciya.JUNIOR),
                new ProgramDeveloper(Gradaciya.JUNIOR),
                new ProgramDeveloper(Gradaciya.MIDDLE),
                new ProgramDeveloper(Gradaciya.MIDDLE),
                new ProgramDeveloper(Gradaciya.SENIOR),
        };
        Project project = new Project(people);
        project.workingDay(people);
    }
}
