import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
//        String n = Rojan;
//        String o = RoseOn;
        String n,o,p;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: "  );
        n = sc.nextLine();
        System.out.println("Enter o: " );
        o = sc.nextLine();

        System.out.println("Before Swapping " +n +" "+o);

        p = n;
        n = o;
        o = p;

        System.out.println("After Swapping " +n +" "+o);
//        System.out.println();





    }
}
