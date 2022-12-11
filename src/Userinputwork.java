import java.util.Scanner;

public class Userinputwork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first name");
        String firstname = sc.nextLine();
        System.out.println("lastname");
        String lastname = sc.nextLine();
        System.out.println("last name");
        System.out.println(" fullname is :" +firstname + " " +lastname);
    }
}
