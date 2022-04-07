package conditional_statements;

public class SwitchDemo2 {

    public static void main(String[] args) {

        int age=100;

        switch (age){

            case 9:
                System.out.println("Person is Child");
                break;
            case 18:
                System.out.println("Person is Young");
                break;
            case 45:
                System.out.println("Person is Mid Age");
                break;
            case 70:
                System.out.println("Person is Old age");
                break;
            default:
                System.out.println("Did not find any age range");
        }

    }
}
