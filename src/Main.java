import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        text();
        int num = input.nextInt();
        while (num != 0)
        {
            System.out.print("Введите a=");
            Scanner agh = new Scanner(System.in);
            double a = agh.nextDouble();
            System.out.print("Введите b=");
            double b = agh.nextDouble();
        if (num != 5) {
                vicheslenia(a, b, num);
        } else {
                System.out.print("Введите с=");
                double c = agh.nextDouble();
                kvadrat(a, b, c);

            }
            text();
            num = input.nextInt();
       }

    }
    public static void text ()
    {
        System.out.println("0- Чтобы закрыть программу введите");
        System.out.println("1- a+b");
        System.out.println("2- a-b");
        System.out.println("3- a*b");
        System.out.println("4- a/b");
        System.out.println("5- квадратное уравнение вида ax²+bx+c=0");
        System.out.println("Введите действие");
    }
    public static void vicheslenia(double a, double b, int num)
    {
        if (num == 1) {
            System.out.println("a+b=" + (a + b));
        } else if (num == 2) {
            System.out.println("a-b=" + (a - b));
        } else if (num == 3) {
            System.out.println("a*b=" + (a * b));
        } else if (num == 4) {
            System.out.println("a/b=" + (a / b));
        }
    }

    public static void kvadrat(double a, double b, double c) {

        // система с дискриминантом
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1 = (-1 * b - Math.sqrt(D)) / (2 * a);
            double x2 = (-1 * b + Math.sqrt(D)) / (2 * a);
            // вся эта длинная штука это ввод чисел и попытки взять дискременант
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }
        // попытки сделать всё красиво а тут что будет если он будет =0 т.е 1 корень
        else if (D == 0) {
            double x = (-1 * b) / (2 * a);
            System.out.println("x=" + x);
        }
        // что делать если нет корней
        else if (D < 0) {
            System.out.println("Нет корней");
        }
    }
}




