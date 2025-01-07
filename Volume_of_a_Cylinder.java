import java.util.*;

public class Volume_of_a_Cylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius");
        double Radius = sc.nextDouble();
		System.out.println("Enter the height");
        double height = sc.nextDouble();
        double volume = 3.14 * (Radius*Radius)*height;
        System.out.println(" The Volume of a cylinder is :"+ volume);
    }
}
