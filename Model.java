public class Model {
    LoggerCalc loggerCalc = new LoggerCalc();
    public void operation(Controller controller){
        int x = controller.getX();
        int y = controller.getY();
        String op = controller.getOp();
        switch (op) {
            case "+" -> {
                System.out.println(x + y);
                loggerCalc.logging(x, y, op);
            }
            case "-" -> {
                System.out.println(x - y);
                loggerCalc.logging(x, y, op);
            }
            case "/" -> {
                System.out.println(x / y);
                loggerCalc.logging(x, y, op);
            }
            case "*" -> {
                System.out.println(x * y);
                loggerCalc.logging(x, y, op);
            }
            default -> System.out.println("Enter correct operation");
        }
    }
}
