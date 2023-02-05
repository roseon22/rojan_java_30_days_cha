import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String fname = sc.nextLine();
        System.out.println("Enter Last Name: ");
        String lname = sc.nextLine();


        System.out.println("My full name is "+ fname +" " + lname);
    }
}
