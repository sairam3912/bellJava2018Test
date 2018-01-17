import java.util.Scanner;
public class minimumOfNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1=scan.nextInt();
		System.out.println("Enter the second number : ");
		int num2=scan.nextInt();
		System.out.println("Enter the third number : ");
		int num3=scan.nextInt();
		System.out.println("Enter the fourth number : ");
		int num4=scan.nextInt();
		
		
		calculateMin(num1, num2, num3, num4);
	

	}

	private static void calculateMin(int num1, int num2, int num3, int num4) {
		if((num1<num2)&&(num1<num3)&&(num1<num4))
			System.out.println("The minimum of  given 4 numbers is : " +num1);
		else if((num2<num1)&&(num2<num3)&&(num2<num4))
			System.out.println("The minimum of given 4 numbers is : " +num2);
		else if((num3<num1)&&(num3<num2)&&(num3<num4))
			System.out.println("The minimum of  given 4 numbers is : " +num3);
		else 
			System.out.println("The minimum of  given 4 numbers is : " +num4);
		
	}

}
