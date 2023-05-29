public class Adapter extends Model{
    ComplexLoggerCalc loggerCalc = new ComplexLoggerCalc();
    public void operation(ComplexController controller){
        int aX = controller.getaX();
        int bX = controller.getbX();
        int aY = controller.getaY();
        int bY = controller.getbY();
        String op = controller.getOp();
        switch (op) {
            case "+" -> {
                System.out.println((aX + aY) + " + " + (bX + bY) + "i" );
                loggerCalc.logging(aX, bX, aY, bY, op);
            }
            case "-" -> {
                System.out.println((aX - aY) + " + " + (bX - bY) + "i" );
                loggerCalc.logging(aX, bX, aY, bY, op);
            }
            default -> System.out.println("Enter correct operation");
        }
    }
}
