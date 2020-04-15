import homeWork1.conditions.CountExpression;
import homeWork1.linearAlgorithms.CreditSetOff;
import homeWork1.linearAlgorithms.EquationStraight;
import homeWork1.linearAlgorithms.HypotenuseLength;
import homeWork1.linearAlgorithms.SquareEquation;

import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //creditSetOff();
        //getHypotenuseLength();
        //getEquationStraight();
        //squareEquation();
        //getCountExpression();
    }

    public static void creditSetOff(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму кредита: ");
        double sumCredit = in.nextInt();
        System.out.print("Введите срок кредита: ");
        double month = in.nextInt();
        System.out.print("Введите процент по кредиту: ");
        double percent = in.nextInt();
        in.close();

        CreditSetOff monthlyPayments = new CreditSetOff();
        System.out.println(monthlyPayments.monthlyPayments(sumCredit, month, percent));
        System.out.println(monthlyPayments.totalPayout(sumCredit, month, percent));
    }

    public static void getHypotenuseLength(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину первого катет: ");
        int cat1 = in.nextInt();
        System.out.print("Введите длину второго катет: ");
        int cat2 = in.nextInt();
        in.close();

        HypotenuseLength a = new HypotenuseLength();
        System.out.println(a.GetHypotenuseLength(cat1, cat2));
    }

    public static void getEquationStraight(){
        Scanner in = new Scanner(System.in);
        System.out.print("x1 равен: ");
        double x1 = in.nextDouble();
        System.out.print("x2 равен: ");
        double x2 = in.nextDouble();
        System.out.print("y1 равен: ");
        double y1 = in.nextDouble();
        System.out.print("y2 равен: ");
        double y2 = in.nextDouble();
        in.close();

        EquationStraight s = new EquationStraight();
        double b = s.getEquationStraight(x1, x2, y1, y2);
        double k = s.getK(x1, x2, y1, y2);
        System.out.printf("y = %fx + %f ", k, b);
    }

    public static void squareEquation(){
        Scanner in = new Scanner(System.in);
        System.out.print("a равено: ");
        double a = in.nextDouble();
        System.out.print("b равено: ");
        double b = in.nextDouble();
        System.out.print("c равено: ");
        double c = in.nextDouble();
        in.close();

        SquareEquation s = new SquareEquation();
        double[] arr = s.calcRoots(a, b, c);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void getCountExpression(){
        CountExpression maxValue = new CountExpression();
        Random rnd = new Random();
        int a = (-10) + rnd.nextInt(10);
        int b = (-10) + rnd.nextInt(10);
        int c = (-10) + rnd.nextInt(10);

        System.out.printf("a = %d \n", a);
        System.out.printf("b = %d \n", b);
        System.out.printf("c = %d \n", c);
        System.out.printf ("maxValue = %d", maxValue.calcMax(a, b, c));
    }
}
