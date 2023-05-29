import java.util.Scanner;

public class Controller {
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getOp() {
        return op;
    }


    private int x;
    private int y;
    private String op;

    public Controller() {
    }

    public void getData(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number x: ");
        int x = scan.nextInt();
        System.out.println("Enter operation: ");
        String op = scan.next();
        System.out.println("Enter number y: ");
        int y = scan.nextInt();
        this.x = x;
        this.y = y;
        this.op = op;
    }

    @Override
    public String toString() {
        return String.format("%d,%s,%d", x, op, y);
    }
}
