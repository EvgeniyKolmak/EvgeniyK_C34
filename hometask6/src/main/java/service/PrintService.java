package service;

import model.Cat;
import model.Dog;

public class PrintService {

    public String print(Cat cat) {
        return cat.getName();
    }

    public String print(Dog dog) {
        return dog.getName();
    }

}
