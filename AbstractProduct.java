abstract class AbstractProduct {
    int id;

    AbstractProduct(int id){
        this.id=id;
    }

    abstract void display();
}

class Book extends AbstractProduct {
    Book(int id){ super(id); }

    void display(){
        System.out.println("Book ID: "+id);
    }
}

class CD extends AbstractProduct {
    CD(int id){ super(id); }

    void display(){
        System.out.println("CD ID: "+id);
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractProduct p;

        p = new Book(1);
        p.display();

        p = new CD(2);
        p.display();
    }
}
