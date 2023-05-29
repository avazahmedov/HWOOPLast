import java.util.Stack;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerCalc {
    Logger logger = Logger.getLogger(Model.class.getName());
    ConsoleHandler ch = new ConsoleHandler();
    SimpleFormatter sFormat = new SimpleFormatter();
    Stack<Integer> newstack = new Stack<>();
    public void logging(int x, int y, String op){
        ch.setFormatter(sFormat);
        switch (op) {
            case "+":
                logger.info(x + " + " + y + " = " + (x + y));
                newstack.add(x + y);
                break;
            case "-":
                logger.info(x + " - " + y + " = " + (x - y));
                newstack.add(x - y);
                break;
            case "/":
                logger.info(x + " / " + y + " = " + (x / y));
                newstack.add(x / y);
                break;
            case "*":
                logger.info(x + " * " + y + " = " + (x * y));
                newstack.add(x * y);
                break;
        }
    }
}
