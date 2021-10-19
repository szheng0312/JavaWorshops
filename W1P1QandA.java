import java.util.Scanner;

public class W1P1QandA {
    public static void main(String[] args){
        System.out.println("What is your name?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        System.out.println("What is your age?");
        Scanner in2 = new Scanner(System.in);
        int age = in2.nextInt();

        System.out.println("What is your phone number?");
        Scanner in3 = new Scanner(System.in);
        String phoneNumber = in3.nextLine();

        System.out.println("What is your School?");
        Scanner in4 = new Scanner(System.in);
        String school = in4.nextLine();

        System.out.println("What is your favorite color?");
        Scanner in5 = new Scanner(System.in);
        String favColor = in5.nextLine();

        System.out.println(name);
        System.out.println(age);
        System.out.println(favColor);
        System.out.println(school);
        System.out.println(phoneNumber);




    }
}
