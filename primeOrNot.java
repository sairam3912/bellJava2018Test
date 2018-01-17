import java.util.Scanner;

public class primeOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		int n = scan.nextInt();
		int count=0;
		for(int i=2; i<=(n/2);i++) {
			if(n%i==0)
			{
				count=1;
				
			}
			break;
		}
		if(count==0) {
			System.out.println("The number is a prime number: ");
		}
		else {
			System.out.println("The number entered is not a prime number");
		}
		
		

	}

}
