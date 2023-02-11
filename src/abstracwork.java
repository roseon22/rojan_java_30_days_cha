import javax.xml.xpath.XPathVariableResolver;

public class abstracwork {
    public static void main(String[] args) {

        study s = new study();
        s.bookpage();

        toolazy t = new toolazy();
        t.bookpage();

    }
}

abstract  class book{
    public abstract void bookpage();

    public void printdetails(){
        System.out.println("Book Details");
    }

}

class study extends book{
    public void bookpage(){
        System.out.println("10,000 book pages");
    }
}

class toolazy extends book{
    public void bookpage(){
        System.out.println("Alweays goes to sleep");
    }
}