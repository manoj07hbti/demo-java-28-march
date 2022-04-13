package class_and_object;

public class BookWithParamConstructor {

    String name;
    String writerName;
    int pages;
    double price;

    //parameterized constructor

    public BookWithParamConstructor(String name, String writerName, int pages, double price) {
        this.name = name;
        this.writerName = writerName;
        this.pages = pages;
        this.price = price;
    }

    public static void main(String[] args) {

        // syntax: ClassName obj_name= new ClassName(param1, param2, param3....);


        BookWithParamConstructor obj= new BookWithParamConstructor("Java","Games",400,500.5);

        System.out.println("Printing Name: "+obj.name);
        System.out.println("Printing Writer Name: "+obj.writerName);
        System.out.println("Printing Pages : "+obj.pages);
        System.out.println("Printing Price : "+obj.price);
        System.out.println("\n");
        System.out.println("\n");


        BookWithParamConstructor obj2= new BookWithParamConstructor("Spring","Gosling",300,1000.5);
        System.out.println("Printing Name: "+obj2.name);
        System.out.println("Printing Writer Name: "+obj2.writerName);
        System.out.println("Printing Pages : "+obj2.pages);
        System.out.println("Printing Price : "+obj2.price);



    }


}
