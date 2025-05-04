import org.company.model.Director;
import org.company.model.Worker;
import org.company.service.EmployeeService;


public class MainApp {

    public static void main(String[] args) {
        Worker worker1 = new Worker("John", "Smith", 15);
        Worker worker2 = new Worker("Jack", "Mash", 10);
        Worker worker3 = new Worker("Jacob", "Brown", 5);

        System.out.println(worker1.toString());
        System.out.println(worker2.toString());
        System.out.println(worker3.toString());

        Director director1 = new Director( "Paul", "Banks", 20);

        director1.add(worker1);
        director1.add(worker2);

        System.out.println(director1);

        Director director2 = new Director("Peter", "Hans", 17);
        director2.add(worker3);

        director1.add(director2);

        System.out.println(director1);


        EmployeeService service = new EmployeeService();boolean isExist = service.hasSubordinate(director1, "Jacob");
        System.out.println(isExist);

        System.out.println(director1.getPost());
        System.out.println(worker1.getPost());

    }

}