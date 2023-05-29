import java.util.Stack;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ComplexLoggerCalc extends LoggerCalc{
    Logger logger = Logger.getLogger(Model.class.getName());
    ConsoleHandler ch = new ConsoleHandler();
    SimpleFormatter sFormat = new SimpleFormatter();
    Stack<Integer> newstack = new Stack<>();
    public void logging(int aX, int bX, int aY, int bY, String op){
        ch.setFormatter(sFormat);
        switch (op) {
            case "+":
                logger.info(aX + "+" + bX + "i" + " + " + aY + "+" + bY + "i" +
                        " = " + ((aX + aY) + " + " + (bX + bY) + "i" ));
                newstack.add((aX + aY) + (bX + bY));
                break;
            case "-":
                logger.info(aX + "+" + bX + "i" + " - " + aY + "+" + bY + "i" +
                        " = " + ((aX - aY) + " + " + (bX - bY) + "i" ));
                newstack.add((aX - aY) + (bX - bY));
                break;
        }
    }
}
