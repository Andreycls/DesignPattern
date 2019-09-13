package cor.main;

import cor.abstractHandler.AbstractWork;
import cor.work.Running;
import cor.work.Sleeping;
import cor.work.Walking;

public class ChainPatternDemo {

    private static AbstractWork getChainOfWorks(){

        AbstractWork sleeping = new Sleeping(AbstractWork.SLEEPY);
        AbstractWork walking = new Walking(AbstractWork.AWAKE);
        AbstractWork running = new Running(AbstractWork.READY);

        sleeping.setNextWork(walking);
        //walking.setNextWork(running);


        return sleeping;
    }

    public static void main(String[] args) {
        AbstractWork workChain = getChainOfWorks();

        workChain.logMessage(AbstractWork.SLEEPY,
                "SLEEPY");
        workChain.logMessage(AbstractWork.AWAKE,
                "AWAKE");

        workChain.logMessage(AbstractWork.READY,
                "READY");


    }
}