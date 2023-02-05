import java.io.File;

public class dfile {
    public static void main(String[] args) {

        try{
            File f = new File("info.txt");
            if (f.delete()){
                System.out.println("File Deleted");

            }
            else {
                System.out.println("File Doesn't Exist");
            }
        }

        catch(Exception ex){
            System.out.println("Not Working Error 404 !!");
        }
    }
    }

