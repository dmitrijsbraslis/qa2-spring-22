package lesson2;

import org.junit.jupiter.api.Test;

public class First {
    @Test
    public void first() {
        int a = 3;
        int b = 16;
        int c = sum(a, b);
        System.out.println(c);

//        One line comment

//        Multi
//        Line
//        Comment

        /*
        Another
        Multi
        Line
        Comment
         */

        System.out.println(sum(22, 15)); //Gives us sum of two digits
    }

    private int sum(int a, int b) {
        System.out.println("First digit is: " + a + " and second is: " + b + "!");
        //                 "First digit is: 3 and second is: 16"
        int c = a + b;
        return c;
    }

    @Test
    public void usingObjects() {
        Student mihail = new Student();
        mihail.setFirstName("Mihail");
        mihail.setLastName("The greatest");
        mihail.setAge(18);
        mihail.setPersonalCode("123456-11111");

        Student timur = new Student();
        timur.setFirstName("Timur");
        timur.setLastName("Timurovich");
        timur.setAge(24);
        timur.setPersonalCode("543211-12345");

        System.out.println(mihail.getFirstName() + " " + mihail.getLastName());
        System.out.println(timur.getFirstName() + " " + timur.getLastName());
    }
}
