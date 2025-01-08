import java.util.Scanner;

public class Convert_Kilometers_to_Miles {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the Kilometeres:");
        double Kilometers= sc.nextInt();
        double Miles= Kilometers * 0.621371;
        System.out.println(" Kilometers to Miles is L:"+ Miles);
    }
}