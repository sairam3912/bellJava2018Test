import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		int rev=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number that has to reversed: ");
		int n=scan.nextInt();
		
		/*for(int i=0;i<n;) {
			rev= rev*10;
			rev=(n%10)+rev;
			n=n/10;
		}*/
		while(n!=0) {
			rev= rev*10;
			rev=(n%10)+rev;
			n=n/10;
			
		}
		System.out.println("Reverse of given number is :" +rev);
		

	}

}
