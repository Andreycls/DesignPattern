package decorator.decoratorClass;

import decorator.model.Employee;

public abstract class EmployeeDecorator implements Employee {
    protected Employee decoratedEmployee;

    public EmployeeDecorator(Employee decoratedEmployee){
        this.decoratedEmployee = decoratedEmployee;
    }

    public void work(){
        decoratedEmployee.work();
    }
}