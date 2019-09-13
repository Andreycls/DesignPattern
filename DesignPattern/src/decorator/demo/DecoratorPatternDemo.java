package decorator.demo;

import decorator.decoratorInstance.NormalEmployeeDecorator;
import decorator.instance.FrontEndDev;
import decorator.instance.BackEndDev;
import decorator.model.Employee;

public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Employee newFrontDev = new FrontEndDev();
        Employee newBackEndDev = new BackEndDev();

        Employee newVersionFrontDev = new NormalEmployeeDecorator(new FrontEndDev());

        Employee newVersionBackDev = new NormalEmployeeDecorator(new BackEndDev());
        System.out.println("Front End Developer without normal working hour");
        newFrontDev.work();

        System.out.println("\nBack End Developer without normal working hour");
        newBackEndDev.work();

        System.out.println("\nFront End Developer with normal working hour");
        newVersionFrontDev.work();

        System.out.println("\nBack End Developer with normal working hour");
        newVersionBackDev.work();
    }
}