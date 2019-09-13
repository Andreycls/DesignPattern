package cor.work;

import cor.abstractHandler.AbstractWork;

public class Running extends AbstractWork {

    public Running(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Running.. ");
    }
}