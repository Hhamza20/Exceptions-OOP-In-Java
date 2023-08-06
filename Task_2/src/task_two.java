
import java.util.Scanner;

public class task_two {
    static int computeDivision(int a, int b) {
        int res = 0;
        try {
            res = a / b;
            System.out.println(res);
        } catch (NumberFormatException ex) {
            System.out.println("Number format exception occured! ");
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic exception occured! ");
        } finally {
            System.out.println("Finally Statement Executed!");
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        try {
            int a = s1.nextInt();
            int b = s1.nextInt();
            int i = computeDivision(a, Integer.parseInt("b"));
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        } catch (NumberFormatException ex) {
            System.out.println("Number format exception occurred! ");
        } finally {
            System.out.println("Finally Statement Executed!");
        }
    }
}


