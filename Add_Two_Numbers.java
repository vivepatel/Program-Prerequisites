import java.util.Scanner;

public class Add_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number 1");
        int a =sc.nextInt();
		System.out.println("Enter the Number 2");
        int b= sc.nextInt();
        System.out.println("The Addition of the Two Numbers is :"+ (a+b));
    }
}