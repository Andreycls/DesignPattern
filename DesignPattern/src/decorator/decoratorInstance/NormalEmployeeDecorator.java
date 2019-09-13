package decorator.decoratorInstance;

import decorator.decoratorClass.EmployeeDecorator;
import decorator.model.Employee;

public class NormalEmployeeDecorator extends EmployeeDecorator {

    public NormalEmployeeDecorator(Employee decoratedEmployee) {
        super(decoratedEmployee);
    }

    @Override
    public void work() {
        decoratedEmployee.work();
        setNormalWorkingHour(decoratedEmployee);
    }

    private void setNormalWorkingHour(Employee decoratedEmployee){
        System.out.println("Working Hour: 9 to 5");
    }
}