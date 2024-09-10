import java.util.*;
class Book {
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id,String name,String author,String publisher,int quantity){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;
    }
}

public class MapExample{
    public static void main(String [] args){
        Map<Integer,Book>map=new HashMap<>();

        Book b1=new Book(101,"AYO","ss","yy",45);
        Book b2=new Book(141,"jYO","si","yi",45);
        Book b3=new Book(161,"yYO","su","y8",45);
        
        map.put(1,b1);  
        map.put(2,b2);  
        map.put(3,b3);  
      
    }
}