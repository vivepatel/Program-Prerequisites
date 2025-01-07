import java.util.*;

public class Area_of_a_Circle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius");
        int Radius= sc.nextInt();
        double Area = 3.14 * (Radius*Radius);
        System.out.println("Area of the Circle is :"+ Area);
    }
}
