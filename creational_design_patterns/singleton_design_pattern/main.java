package creational_design_patterns.singleton_design_pattern;

public class main {
    public static void main(String[] args) {
        Logger logger=Logger.getInstance();
        logger.log("Hello world!");


        Logger logger1=Logger.getInstance();
        logger1.log("Testing the second logger");

    }
}
