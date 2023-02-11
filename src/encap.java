public class encap {
    public static void main(String[] args) {
        Bag b = new Bag();
        b.SetId(2);
        b.SetName("CarryMe");

        Bag b1 = new Bag();
        b1.SetId(4);
        b1.SetName("CarrsfgyMe");

        Bag b2 = new Bag();
        b2.SetId(6);
        b2.SetName("DontCarryMe");

        b.Printinfo();
        b1.Printinfo();
        b2.Printinfo();


    }
}

class Bag{
     public int id;
     public String name;

//    Creating getter and setter

    int getId(){
        return this.id;
    }
    String getName(){
        return this.name;
    }

    void setId(){
        this.id = id;
    }

    void setName(int id){
        this.name = name;
    }

    void Printinfo(String name){
        System.out.println("Bag Code ID is "+this.Setid);
        System.out.println("Bag name is "+this.SetName);

    }
}


