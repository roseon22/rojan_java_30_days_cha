
import java.io.File;
import java.io.FileWriter;
public class wfile {
    public static void main(String[] args) {

        try{
            FileWriter fw = new FileWriter("info.txt", true);
            fw.write("hello");
            fw.close();
            System.out.println("Written Successfully inside File");

        }
        catch (Exception ex){
            System.out.println("ERROR 404 !!");
        }
//        finally {
//
//        }
    }
}
