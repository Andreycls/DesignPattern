package cor.abstractHandler;
public abstract class AbstractWork {
    public static int READY = 1;
    public static int AWAKE = 2;
    public static int SLEEPY = 3;

    protected int level;

    protected AbstractWork nextWork;

    public void setNextWork(AbstractWork nextWork){
        this.nextWork = nextWork;
    }

    public void logMessage(int level, String message){
        if(this.level <= level){
            write(message);
        }
        if(nextWork !=null){
            nextWork.logMessage(level, message);
        }
    }

    abstract protected void write(String message);

}