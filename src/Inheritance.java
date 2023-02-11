public class Inheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Rojan";
        s.age = 22;

        s.printInfo();

    }
}


class Person{
    String name;
    int age;

    void printInfo(){
        System.out.println("Name is "+name);
        System.out.println(("Age is "+age));
    }
}

class Student extends Person{


}
