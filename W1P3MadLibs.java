import java.util.Scanner;
public class W1P3MadLibs {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a date in the form mm/dd");
        String date = in.nextLine();
        System.out.println("Enter your name.");
        String name = in.nextLine();
        System.out.println("Enter your friend's name.");
        String name2 = in.nextLine();
        System.out.println("Enter an object you always bring.");
        String object = in.nextLine();
        System.out.println("Enter the name for a hiking trail.");
        String trailName = in.nextLine();
        System.out.println("Enter an animal.");
        String animal = in.nextLine();

        System.out.println("On the morning of"+date+", "+name+" and "+name2+" packed their bags in preparation to go hike on "+trailName+", remembering to bring their "+object+". The hike was a lot of fun, they even got to see some "+animal+'.');
    }
}
