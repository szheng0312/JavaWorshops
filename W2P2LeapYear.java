
public class W2P2LeapYear {
    public static void main(String[] arg){
        for (int i = 1948; i < 2069; i++){
            if (i % 4 == 0){
                System.out.println(i + " is a leap year");
            }
            if (i == 2007){
                System.out.println(i + " is my birth year");
            }
        }
    }
}
