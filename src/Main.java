import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        Making Scanner Object
  Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name");
        String n1 = sc.nextString();
        System.out.println("Enter Last Name");
        String n2 = sc.nextString();

        String fullname = n1 + " "+ n2;
        System.out.println("Your Fullname is"+fullname);
    }
}