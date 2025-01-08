import java.util.Scanner;

public class Perimeter_of_a_Rectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the Length and Breath ");
        int length= sc.nextInt();
        int Breath= sc.nextInt();
        int Perimeter= 2*(length+ Breath);
        System.out.println("The Perimeter of a Rectangle  is:"+ Perimeter);

    }
}