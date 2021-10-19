import java.util.Scanner;

public class W1P2ShoppingCalc{
    public static void main(String[] args){
        System.out.println("What is the price of the first missle?");
        Scanner in = new Scanner(System.in);
        double missile1 = in.nextDouble();

        System.out.println("What is the price of the second missle?");
        Scanner in2 = new Scanner(System.in);
        double missile2 = in2.nextDouble();

        System.out.println("What is the price of the third missle?");
        Scanner in3 = new Scanner(System.in);
        double missile3 = in3.nextDouble();

        System.out.println("What is the price of the fourth missle?");
        Scanner in4 = new Scanner(System.in);
        double missile4 = in4.nextDouble();

        System.out.println("What is the price of the fifth missle?");
        Scanner in5 = new Scanner(System.in);
        double missile5 = in5.nextDouble();
        
        double totalCost = missile1 + missile2 + missile3 + missile4 + missile5;
        System.out.println(totalCost);
    }
}