import java.util.Scanner;

public class ComplexController {
    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    public String getOp() {
        return op;
    }


    private String x;
    private String y;
    private String op;

    public int getaX() {
        return aX;
    }

    public int getbX() {
        return bX;
    }

    public int getaY() {
        return aY;
    }

    public int getbY() {
        return bY;
    }

    private int aX;
    private int bX;
    private int aY;
    private int bY;

    public ComplexController() {
    }

    public void getData(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a of number x: ");
        int aX = scan.nextInt();
        System.out.println("Enter b of number x: ");
        int bX = scan.nextInt();
        System.out.println("Enter an operation: ");
        String op = scan.next();
        System.out.println("Enter a of number y: ");
        int aY = scan.nextInt();
        System.out.println("Enter b of number y: ");
        int bY = scan.nextInt();
        this.x = aX + "+" + bX + "i";
        this.y = aY + "+" + bY + "i";
        this.op = op;
        this.aX = aX;
        this.bX = bX;
        this.aY = aY;
        this.bY = bY;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s", x, op, y);
    }
}
