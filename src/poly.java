public class poly {
    public static void main(String[] args) {
        Mic m1 = new Mic();
         m1.printInfo();

        Mic m2 = new BoyaMic();
        m2.printInfo();

        Mic m3= new ROdeMic();
        m3.printInfo();

    }
}

class Mic{
    void printInfo(){
        System.out.println("This is default Mic");
    }
}

class ROdeMic extends Mic{

    void printInfo(){
        System.out.println("This is Rode Microphone");
    }
}

class BoyaMic extends Mic{

    void printInfo(){
        System.out.println("This is Boya Microphone");
    }
}
