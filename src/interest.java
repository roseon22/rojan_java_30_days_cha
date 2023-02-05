import java.util.Scanner;

public class interest {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float p,t,r,f;

        System.out.println("Enter value of Principle (P): " );
        p = sc.nextFloat();


        System.out.println("Enter value of Time in Years (T): " );
        t = sc.nextFloat();


        System.out.println("Enter value of Rate (R): " );
        r = sc.nextFloat();

        f = (p*t*r)/100;




        System.out.println("Simple Interest = "+f );








    }
}
