import java.util.Scanner;

public class Main {
    public  static  void main(String[] args) {
        int n=0;
        System.out.println("1- a+b");
        System.out.println("2- a-b");
        System.out.println("3- a*b");
        System.out.println("4- a/b");
        System.out.println("5- квадратное уравнение вида ax²+bx+c=0");
        System.out.println("Введите действие");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        // запросы чисел при первом действии
        if(num==1){
            System.out.print("Введите a=");
            Scanner agh = new Scanner(System.in);
            double a = agh.nextDouble();
            System.out.print("Введите b=");
            Scanner bgh = new Scanner(System.in);
            double b = bgh.nextDouble();
            System.out.println("a+b=" + (a+b));
        }
        // здесь берётся 2 действие
        else if(num==2){
            System.out.print("Введите a=");
            Scanner agh = new Scanner(System.in);
            double a = agh.nextDouble();
            System.out.print("Введите b=");
            Scanner bgh = new Scanner(System.in);
            double b = bgh.nextDouble();
            System.out.println("a-b=" + (a-b));
        }

        else if (num==3){
            System.out.print("Введите a=");
            Scanner agh = new Scanner(System.in);
            double a = agh.nextDouble();
            System.out.print("Введите b=");
            Scanner bgh = new Scanner(System.in);
            double b = bgh.nextDouble();
            System.out.println("a*b=" + (a*b));
        }
        else if (num==4){
            System.out.print("Введите a=");
            Scanner agh = new Scanner(System.in);
            double a = agh.nextDouble();
            System.out.print("Введите b=");
            Scanner bgh = new Scanner(System.in);
            double b = bgh.nextDouble();
            System.out.println("a/b=" + (a/b));
        }
        // система с дискриминантом
        else if (num==5){
            System.out.print("Введите a=");
            Scanner agh = new Scanner(System.in);
            double a = agh.nextDouble();
            System.out.print("Введите b=");
            Scanner bgh = new Scanner(System.in);
            double b = bgh.nextDouble();
            System.out.print("Введите с=");
            Scanner cgh =new Scanner(System.in);
            double c = cgh.nextDouble();
            double D = b*b-4*a*c;
            if (D>0){
                double x1=(-1*b-Math.sqrt(D))/(2*a);
                double x2=(-1*b+Math.sqrt(D))/(2*a);
                // вся эта длинная штука это ввод чисел и попытки взять дискременант
                System.out.println("x1="+x1);
                System.out.println("x2="+x2);
            }
            // попытки сделать всё красиво а тут что будет если он будет =0 т.е 1 корень
            else if (D==0){
                double x =(-1*b)/(2*a);
                System.out.println("x="+x);
            }
            // что делать если нет корней
            else if (D<0){
                System.out.println("Нет корней");
            }
            }
        // да я мог избавится от if но мне так больше нравится
        else
            System.out.println("неправильно выбранно действие");
        }
    }




