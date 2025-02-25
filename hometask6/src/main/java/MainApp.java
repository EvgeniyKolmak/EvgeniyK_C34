import model.Cat;
import model.Dog;
import model.Student;
import service.MathService;
import service.PrintService;
import service.StudentService;

public class MainApp {

    public static void main(String[] args) {

        /*
         * Задание 1
         * Создать метод, который принимает два целых числа.
         * Данный метод должен вернуть максимальное число.
         */
        MathService mathService = new MathService();
        System.out.println(mathService.getMax(1, 2));

        /**
         * Задание 2
         * Необходимо создать два перегруженных метода print.
         * Один метод принимает объект Cat, а второй объект Dog.
         * Каждый из методов должен вернуть кличку животного.
         */
        PrintService printService = new PrintService();
        System.out.println(printService.print(new Cat("Bars")));
        System.out.println(printService.print(new Dog("Rex")));

        /* *
         * Задание 3
         * Необходимо создать объект Student со следующими полями
         * a) имя студента
         * b) возраст студента
         * с) номер группы
         *
         * Создать StudentService класс, с методом который принимает массив студентов и номер группы.
         * Данный метод должен вернуть количество студентов, которые относятся к данной группе.
         */
        Student[] students = new Student[] {
                new Student("John", 19, 1),
                new Student("Mary", 20, 1),
                new Student("Alex", 21, 1),
                new Student("Peter", 21, 2),
                new Student("Paul", 22, 2),
                new Student("Tom", 23, 2),
                new Student("Alice", 23, 3),
                new Student("Bob", 24, 3),
                new Student("Charlie", 25, 3),
                new Student("David", 26, 4),
                new Student("Eve", 27, 4),
                new Student("Frank", 28, 5),
                new Student("Grace", 29, 5),
                new Student("Heidi", 30, 5),
                new Student("Jack", 21, 6),
                new Student("Jill", 22, 6),
                new Student("Kate", 23, 6),
                new Student("Leo", 24, 7),
                new Student("Mia", 25, 7),
                new Student("Nina", 26, 8),
                new Student("Oscar", 27, 8),
        };

        StudentService service = new StudentService();

        int group = 4;

        System.out.printf("В группе %d находится: %d студентов.", group, service.getStudentCountPerGroup(students, group) );

    }

}
