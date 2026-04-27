class Book {
    String title;
    double price;

    Book(String t,double p){
        title=t; price=p;
    }
}

public class Main {
    public static void main(String[] args) {
        Book b[] = {
            new Book("Java",300),
            new Book("C",200),
            new Book("Python",400),
            new Book("DBMS",250)
        };

        double max=0;
        String name="";

        for(Book x:b){
            if(x.price>max){
                max=x.price;
                name=x.title;
            }
        }

        System.out.println(name);
    }
}
