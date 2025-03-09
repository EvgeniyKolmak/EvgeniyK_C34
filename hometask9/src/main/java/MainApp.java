import org.company.model.Director;
import org.company.model.Employee;
import org.company.model.Post;
import org.company.model.Worker;
import org.company.service.EmployeeService;

import java.sql.SQLOutput;

public class MainApp {

    public static void main(String[] args) {
        Worker worker1 = new Worker("John", "Smith", 15, Post.WORKER);
        Worker worker2 = new Worker("Jack", "Mash", 10, Post.WORKER);
        Worker worker3 = new Worker("Jacob", "Brown", 5, Post.WORKER);

        System.out.println(worker1.toString());
        System.out.println(worker2.toString());
        System.out.println(worker3.toString());

        Director director1 = new Director( "Paul", "Banks", 20, Post.DIRECTOR);

        director1.add(worker1);
        director1.add(worker2);

        System.out.println(director1.toString());

        Director director2 = new Director("Peter", "Hans", 17, Post.DIRECTOR);
        director2.add(worker3);

        director1.add(director2);

        System.out.println(director1);


        EmployeeService service = new EmployeeService();boolean isExist = service.hasSubordinate(director1, "Jacob");
        System.out.println(isExist);

    }

}
