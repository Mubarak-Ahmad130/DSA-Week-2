import java.util.Scanner;

public class overload {
    public static double area(double a){
        return 3.14*(a*a);
    }
    public static double area(double a,double b){
        return a*b;
    }
//    change this parameter because issue
    public static double area(int  a){
        return (double)a*a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter radius");
        double radius=sc.nextDouble();
        double circle=area(radius);
        System.out.println("areaof circle is "+circle);

        System.out.println("enter length");
        double length=sc.nextDouble();
        System.out.println("enter width");
        double width=sc.nextDouble();

        double rectangle=area(length,width);
        System.out.println("area of rectangle is "+rectangle);

        System.out.println("enter sides");
        int side=sc.nextInt();
        double square=area(side);
        System.out.println("square is "+square);

    }
}
