package cor.work;

import cor.abstractHandler.AbstractWork;

public class Walking extends AbstractWork {

    public Walking(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Walking...");
    }
}