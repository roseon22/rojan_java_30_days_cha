import java.io.File;

public class cfile {
    public static void main(String[] args) {

        try{
            File f = new File("info.txt");
            if (f.createNewFile()){
                System.out.println("File Created");

            }
            else {
                System.out.println("File Already Exists");
            }
        }

        catch(Exception ex){
            System.out.println("Not Working Error 404 !!");
        }
    }
}



