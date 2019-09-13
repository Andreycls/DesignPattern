package decorator.instance;

import decorator.model.Employee;

public class FrontEndDev implements Employee {

    @Override
    public void work() {
        System.out.println("Work: JS");
    }
}