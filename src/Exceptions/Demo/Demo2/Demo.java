package Exceptions.Demo.Demo2;

public class Demo {
    public static void main(String[] args) {
        String name = "Gustav";
        try {

            System.out.println(name);
            System.out.println(name.charAt(6)); // Print the sixth character
        } catch (Exception e) { // fails to print sixth character cus name is too short
            System.out.println("ERROR: Name too short"); //
        } finally {
            System.out.println(name.charAt(name.length()-1)); // prints last character by finding length and -1
        }
    }
}
