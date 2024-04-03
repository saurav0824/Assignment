

import java.util.Scanner;
public class Simple_Intrest {
    public static void main(String[]args)
    {
    System.out.println("------Program to find Simple Intrest------");
        Scanner principle=new Scanner(System.in);
        System.out.println("Enter principle");
        double p=principle.nextDouble();
        Scanner time=new Scanner(System.in);
        System.out.println("Enter Time");
        double t= time.nextDouble();
        Scanner rate=new Scanner(System.in);
        System.out.println("Enter Rate");
        double r= rate.nextDouble();
        double SI=(p*t*r)/100;
        System.out.println(SI+"is the simple intrest");

    }
}
