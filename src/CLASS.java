public class CLASS {
    public static void main(String[] args) {
    //Creating Object : ClassName objectname = new ClassName();
        Dhulikhel d = new Dhulikhel();

        d.Weather = "Sunny";
        d.university = "Kathmandu University";
        d.hospital = "Dhulikhel Hospital";

        Dhulikhel d2 = new Dhulikhel();
        d2.hospital ="Banepa Hospital";
        d2.Weather = "Rainy";
        d2.university = "Kavre University";

        d.printInfo();
        d2.printInfo();
    }
}
class   Dhulikhel{
    //Property
    String Weather;
    String hospital;
    String university;
    //Function
    void printInfo(){
        System.out.println("Hospital name is "+this.hospital);

        System.out.println("Weather is "+this.Weather);

        System.out.println("High building name is "+this.university);
        System.out.println("\n");
    }
}
