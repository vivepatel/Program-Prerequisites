import java.util.Scanner;

public class Calculate_Simple_Interest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter  Principal , Rate and Time ");
        double Principal= sc.nextDouble();
        double rate= sc.nextDouble();
        double time= sc.nextDouble();
        double Simple_Interest= (Principal*rate*time)/100;
        System.out.println("TheSimple Interest is :"+ Simple_Interest);
    }
}