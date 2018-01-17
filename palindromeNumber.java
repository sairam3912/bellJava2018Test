import java.util.Scanner;
public class palindromeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=scan.nextInt();
		int rev=0,temp;
		temp=n;
		while(n!=0) {
			rev=rev*10;
			rev=rev+(n%10);
			n=n/10;
			
		}
		System.out.println(rev);
		if(rev==temp) {
			System.out.println("The number is palindrome");
		}
		else
			System.out.println("The number is not palindrome");

	}

}
