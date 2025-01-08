import java.util.Scanner;

public class Calculate_Average_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 3 Number");
		int Number_1=sc.nextInt();
		int Number_2= sc.nextInt();
		int NUmber_3= sc.nextInt();
        double Average= (Number_1 + Number_2 + NUmber_3)/3;
		System.out.println("Average of the 3 Numbers is :"+ Average);
		
        
    }
}