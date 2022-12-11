import com.sun.jdi.Value;

public class StringWork {
    public static void main(String[] args) {
        String country = "Nepal";
        String capital = "ktm";
        System.out.println(" length of the country : " +country.length());
        System.out.println("first letter of country is: " +country.charAt(0));
        String cont = " my country is nepal";
        System.out.println(cont.replace("nepal" , "usa"));
        System.out.println(country.substring(3,4));
    }
}
