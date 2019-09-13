package decorator.instance;

import decorator.model.Employee;

public class BackEndDev implements Employee {
    @Override
    public void work() {
        System.out.println("Work: Java");
    }
}
