package Exceptions.Demo.Demo;

public class Throw {
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Ur too Yung");
        } else {
            System.out.println("Welcome aboard");
        }
    }

    public static void main(String[] args) throws Exception {
        checkAge(18);
    }
}

