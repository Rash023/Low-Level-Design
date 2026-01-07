package creational_design_patterns.singleton_design_pattern;

public class Logger {

    //volatile keyword makes sure that any change made by the thread are
    //immediately visible to other threads
    private static volatile Logger instance;


    private Logger(){}

    public static Logger getInstance(){
        if(instance==null){
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message){
        System.out.println("Log:-"+message);
    }
}
