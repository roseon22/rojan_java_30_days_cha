import java.io.File;
import java.util.Scanner;

public class fread {
    public static void main(String[] args) {

        try{
            File f = new File("info.txt");
            Scanner reader = new Scanner(f);
            while (reader.hasNextLine()){
                String p = reader.nextLine();
                System.out.println(p);
            }
            reader.close();
        }
        catch(Exception ex){
            System.out.println("ERROR 4040 !!");
        }
    }
}
