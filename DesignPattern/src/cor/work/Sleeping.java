package cor.work;

import cor.abstractHandler.AbstractWork;

public class Sleeping extends AbstractWork {

    public Sleeping(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Sleeping..." );
    }
}