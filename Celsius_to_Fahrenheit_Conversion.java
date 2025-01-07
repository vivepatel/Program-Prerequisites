import java.util.*;

public class Celsius_to_Fahrenheit_Conversion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  temperauter in Celsius");
        int Temperature= sc.nextInt();
        double Fahrenheit = (Temperature* 9/5)+32;
        System.out.println("The Temperature in Fahrenheit is :"+Fahrenheit);

    }
}
