import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    //Scanner class has been defineted.
    Scanner x= new Scanner(System.in);


    //The variable data types have been defined.
    double a,b,c,u,p,area ;

    //Get values from the user.
    System.out.print("Üçgenin 1.Kenar uzunluğunu giriniz=");
    a= x.nextDouble();

    System.out.print("Üçgenin 2.Kenar uzunluğunu giriniz=");
    b=x.nextDouble();

    System.out.print("Üçgenin 3.Kenar uzunluğunu giriniz=");
    c=x.nextDouble();

    //The perimeter of the triangle has been calculated.
    p=(a+b+c);

    //Math class has been defined.Then, the area of the triangle has been calculated.
    u=p/2;
    area=Math.sqrt(u*(u-a)*(u-b)*(u-c));
    System.out.print("Üçgenin alanı=" +area);



    }
}