package class_and_object;

public class Book {

    //PROPERTIES OR DATA MEMBER OR MEMBER FUNCTION
    // name
    String name="Java";
    // writer
    String wrtier="Games Gosling";
    // pages
    int pages=900;
    // cost
    double price=500.15;


    public static void main(String[] args) {

      // syntax: ClassName obj_name= new ClassName();
         Book book1= new Book();
      // use object to access data member :  obj_name.property_name;

        System.out.println(book1.name);
        System.out.println(book1.pages);
        System.out.println(book1.price);
        System.out.println(book1.wrtier);

        Book book2= new Book();
        // changing data of object
        book2.name="SPRING";
        book2.price=1000.45;
        System.out.println(book2.name);
        System.out.println(book2.pages);
        System.out.println(book2.price);
        System.out.println(book2.wrtier);

    }

}
