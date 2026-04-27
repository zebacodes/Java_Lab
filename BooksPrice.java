class Book {
    String title;
    double price;

    Book(String t, double p){
        title=t; price=p;
    }
}

public class Main {
    public static void main(String[] args) {
        Book b[] = {
            new Book("A",100),
            new Book("B",200),
            new Book("C",150)
        };

        double max=0;
        String name="";

        for(Book x:b){
            if(x.price>max){
                max=x.price;
                name=x.title;
            }
        }

        System.out.println("Highest price book: "+name);
    }
}
